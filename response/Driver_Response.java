package com.codecaique.hiakk.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Driver_Response
{
    @Expose
    @SerializedName("data")
    private DataBean data;
    @Expose
    @SerializedName("error")
    private int error;
    @Expose
    @SerializedName("message")
    private String message;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public static class DataBean {
        private int id;
        private String first_name;
        private String last_name;
        private String email;
        private String passwords;
        private String phone;
        private String state;
        private String image;
        private String gender;
        private String longitude;
        private String latitude;
        private String firebase_token;
        private String user_token;

        public DataBean(int id, String first_name, String last_name, String email, String passwords, String phone, String state, String image, String gender, String longitude, String latitude, String firebase_token, String user_token) {
            this.id = id;
            this.first_name = first_name;
            this.last_name = last_name;
            this.email = email;
            this.passwords = passwords;
            this.phone = phone;
            this.state = state;
            this.image = image;
            this.gender = gender;
            this.longitude = longitude;
            this.latitude = latitude;
            this.firebase_token = firebase_token;
            this.user_token = user_token;
        }

        public DataBean(int id, String phone, String first_name, String image, String passwords) {
            this.id = id;
            this.phone = phone;
            this.first_name = first_name;
            this.image = image;
            this.passwords = passwords;
        }

        public DataBean() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPasswods() {
            return passwords;
        }

        public void setPasswods(String passwods) {
            this.passwords = passwods;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getFirebase_token() {
            return firebase_token;
        }

        public void setFirebase_token(String firebase_token) {
            this.firebase_token = firebase_token;
        }

        public String getUser_token() {
            return user_token;
        }

        public void setUser_token(String user_token) {
            this.user_token = user_token;
        }
    }


}
