package com.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Loading {

    static List<List<Integer>> voters = new ArrayList<List<Integer>>(); //List of voters assigned to tigers
    static List<List<Integer>> assignedTigers = new ArrayList<List<Integer>>(); //List of tigers assigned to the managers
    static ArrayList<String> SilsilaNumber=new ArrayList<>();
    static ArrayList<String> GharanaNumber = new ArrayList<>();
    static ArrayList<String> Name = new ArrayList<>();
    static ArrayList<String> FatherName = new ArrayList<>();
    static ArrayList<Integer> age = new ArrayList<>();
    static ArrayList<String> Address = new ArrayList<>();
    static ArrayList<String> BlockCode = new ArrayList<>();
    static ArrayList<String> phoneNo = new ArrayList<>();
    static ArrayList<String> assign = new ArrayList<>();
    static ArrayList<String> CNIC = new ArrayList<>();
    static ArrayList<Boolean> isTiger= new ArrayList<>();
    static ArrayList<Boolean> isManager= new ArrayList<>();
    static ArrayList<Integer> serialNo=new ArrayList<>();
    static ArrayList<Integer> Tigers=new ArrayList<>();
    static ArrayList<Integer> Managers=new ArrayList<>();
    static ArrayList<String> MngrAssign=new ArrayList<>();
    static Saad mainSaad = null;
    static DatabaseReference mDatabase;


    public static void initialLoad()
    {
        for (int x = 0; x <age.size(); x++)
        {
            serialNo.add(x);

        }
        int size=Array.getLength(age);
        int index=-1;
        for (int x = 0; x <size; x++)
        {
            String tigerCNIC=assign.get(x);  //get index of tiger for every user
            String managerCNIC=MngrAssign.get(x);
            if(tigerCNIC!=null) {
                index = CNIC.indexOf(tigerCNIC);
                voters.get(index).add(x);
                isTiger.set(index,true);
            }
            if(managerCNIC!=null) {
                index = CNIC.indexOf(tigerCNIC);
                assignedTigers.get(index).add(x);
                isManager.set(index,true);
            }
        }

        for (int x = 0; x <age.size(); x++)
        {
            if(isTiger.get(x).equals(true))
                Tigers.add(x);

            if(isManager.get(x).equals(true))
                Managers.add(x);
        }
    }


    public static void LoadObject()
    {
        ArrayList<Voter> LoadVoters = new ArrayList<>();
        ArrayList<Tiger> LoadTigers = new ArrayList<>();
        ArrayList<Manager> LoadManager = new ArrayList<>();

        for (int x = 0; x <age.size(); x++)
        {
            Voter a = new Voter(SilsilaNumber.get(x), GharanaNumber.get(x),  Name.get(x),  FatherName.get(x),  age.get(x),  Address.get(x),  BlockCode.get(x),  phoneNo.get(x),  CNIC.get(x),  serialNo.get(x));
            LoadVoters.add(a);
        }

        for (int x = 0; x <Tigers.size(); x++)
        {

            ArrayList<Voter> assignedVoters = new ArrayList<>();

            for (int i = 0; i <voters.get(x).size(); i++) {
                assignedVoters.add(LoadVoters.get(voters.get(x).get(i)));
            }

            Tiger a = new Tiger(SilsilaNumber.get(x), GharanaNumber.get(x),  Name.get(x),  FatherName.get(x),  age.get(x),  Address.get(x),  BlockCode.get(x),  phoneNo.get(x),  CNIC.get(x),  serialNo.get(x),assignedVoters);
            LoadTigers.add(a);
        }
        int temp=0;
        int test=0;

        for (int x = 0; x <Managers.size(); x++)
        {

            ArrayList<Tiger> FillTigers = new ArrayList<>();


            for (int i = 0; i <assignedTigers.get(x).size(); i++) {

                temp=assignedTigers.get(x).get(i);
                for(int c=0;c<LoadTigers.size();c++)
                {
                    test=LoadTigers.get(c).getSerialNo();
                    if(temp==test)
                    {
                        FillTigers.add(LoadTigers.get(c));
                    }
                }

                FillTigers.add(LoadTigers.get(assignedTigers.get(x).get(i)));

            }

            Manager c = new Manager(SilsilaNumber.get(x), GharanaNumber.get(x),  Name.get(x),  FatherName.get(x),  age.get(x),  Address.get(x),  BlockCode.get(x),  phoneNo.get(x),  CNIC.get(x),  serialNo.get(x),FillTigers);
            LoadManager.add(c);
        }

    }

    public static void saveToFirebase(){

    }
    public void saaat(Loading a)
    {

    }

    public static void loadFromFirebase(final Context c){
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.hasChild("saad")) {
                    mDatabase.addChildEventListener(new ChildEventListener() {
                        @Override
                        public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                                mainSaad = dataSnapshot.getValue(Saad.class);
                                Intent i = new Intent(c,LoginActivity.class);
                                c.startActivity(i);
                        }

                        @Override
                        public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                        }

                        @Override
                        public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                        }

                        @Override
                        public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });
                } else {

                    Saad saad = new Saad("1234","1234","Saad Saeed","",20,"XYZ","ABC","0340-4718228","34313232-71",2,new ArrayList<Manager>());
                    Manager muaz = new Manager("1234","1234","Muaz Maqbool","",20,"XYZ","ABC","0340-4718228","34313232-71",2,new ArrayList<Tiger>());
                    Manager nouman = new Manager("1234","1234","Nouman Ali","",20,"XYZ","ABC","0340-4718228","34313232-71",2,new ArrayList<Tiger>());

                    Tiger neela = new Tiger("1234","1234","Nauman Arshad","",20,"XYZ","ABC","0340-4718228","34313232-71",2,null);
                    Tiger wajid = new Tiger("1234","1234","واجد عقل","",20,"XYZ","ABC","0340-4718228","34313232-71",2,null);
                    Tiger pana = new Tiger("1234","1234","Farhan Azhar","",20,"XYZ","ABC","0340-4718228","34313232-71",2,null);

                    muaz.voters.add(neela);
                    muaz.voters.add(wajid);
                    nouman.voters.add(pana);
                    saad.managers.add(muaz);
                    saad.managers.add(nouman);

                    mDatabase.child("saad").setValue(saad);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }



}
