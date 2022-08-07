package com.codecaique.hiakk.pojo.response;

import java.util.List;

public class Total_Delivery_Response
{

    private String total;
    private int error;
    private String message;
    private List<DataBean> data;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 4
         * name : مطعم كنتاكي
         * image : bef601286cfe9b6f5a967b847469975f.png
         * description :
         * price : 200
         * created_at : 2020-05-06 12:29:08
         * agent_Recivingdistance : 3.6107663381302113
         * client_Recivingdistance : 2286.7884817788163
         */

        private String id;
        private String name;
        private String image;
        private String description;
        private String price;
        private String created_at;
        private String agent_Recivingdistance;
        private String client_Recivingdistance;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
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

        public String getClient_Recivingdistance() {
            return client_Recivingdistance;
        }

        public void setClient_Recivingdistance(String client_Recivingdistance) {
            this.client_Recivingdistance = client_Recivingdistance;
        }
    }
}
