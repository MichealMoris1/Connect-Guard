package com.genius.connectguard;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        sendNewTokenToServer(FirebaseInstanceId.getInstance().getToken());

    }

    private void sendNewTokenToServer(String token) {



    }
}
