package com.codecaique.hiakk.pojo.response;

import java.util.List;

public class DeliveryOffers_Response
{

    private int error;
    private String message;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * receiving_longitude : 27.4
         * name : طرد حياك
         * image :
         * receiving_latitude : 49.4
         * user_longitude : 0
         * user_latitude : 0
         * description : فل
         * delivery_time : 1
         * state : wait
         * created_at : 2020-05-06 01:54:37
         * agent_Recivingdistance : 13.26273588568089
         * client_Recivingdistance : 6083.067070828744
         */

        /**/
        private String id;
        private String receiving_longitude;
        private String name;
        private String image;
        private String receiving_latitude;
        private String user_longitude;
        private String user_latitude;
        private String description;
        private String delivery_time;
        private String state;
        private String created_at;
        private String payment;
        private String agent_Recivingdistance;
        private String client_Recivingdistance;
        private String offered;
        private String delivery_id;
        private String receiving_address;
        private String delivery_address;

        public String getReceiving_address() {
            return receiving_address;
        }

        public void setReceiving_address(String receiving_address) {
            this.receiving_address = receiving_address;
        }

        public String getDelivery_address() {
            return delivery_address;
        }

        public void setDelivery_address(String delivery_address) {
            this.delivery_address = delivery_address;
        }

        public String getDelivery_id() {
            return delivery_id;
        }

        public void setDelivery_id(String delivery_id) {
            this.delivery_id = delivery_id;
        }

        public String getOffered() {
            return offered;
        }

        public void setOffered(String offered) {
            this.offered = offered;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getReceiving_longitude() {
            return receiving_longitude;
        }

        public void setReceiving_longitude(String receiving_longitude) {
            this.receiving_longitude = receiving_longitude;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getReceiving_latitude() {
            return receiving_latitude;
        }

        public void setReceiving_latitude(String receiving_latitude) {
            this.receiving_latitude = receiving_latitude;
        }

        public String getUser_longitude() {
            return user_longitude;
        }

        public void setUser_longitude(String user_longitude) {
            this.user_longitude = user_longitude;
        }

        public String getUser_latitude() {
            return user_latitude;
        }

        public void setUser_latitude(String user_latitude) {
            this.user_latitude = user_latitude;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDelivery_time() {
            return delivery_time;
        }

        public void setDelivery_time(String delivery_time) {
            this.delivery_time = delivery_time;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getAgent_Recivingdistance() {
            return agent_Recivingdistance;
        }

        public void setAgent_Recivingdistance(String agent_Recivingdistance) {
            this.agent_Recivingdistance = agent_Recivingdistance;
        }

        public String getPayment() {
            return payment;
        }

        public void setPayment(String payment) {
            this.payment = payment;
        }

        public String getClient_Recivingdistance() {
            return client_Recivingdistance;
        }

        public void setClient_Recivingdistance(String client_Recivingdistance) {
            this.client_Recivingdistance = client_Recivingdistance;
        }
    }
}
