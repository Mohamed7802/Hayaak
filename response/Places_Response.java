package com.codecaique.hiakk.pojo.response;

import java.util.List;

public class Places_Response
{



    private String next_page_token;
    private String status;
    private List<?> html_attributions;
    private List<ResultsBean> results;

    public String getNext_page_token() {
        return next_page_token;
    }

    public void setNext_page_token(String next_page_token) {
        this.next_page_token = next_page_token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<?> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<?> html_attributions) {
        this.html_attributions = html_attributions;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * business_status : OPERATIONAL
         * geometry : {"location":{"lat":29.0862473,"lng":31.1103687},"viewport":{"northeast":{"lat":29.0875806302915,"lng":31.1117892802915},"southwest":{"lat":29.0848826697085,"lng":31.1090913197085}}}
         * icon : https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png
         * name : Scarlet , Restaurant & Cafe
         * opening_hours : {"open_now":false}
         * photos : [{"height":3096,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/104533697790012746376\">Shahd Alghazally<\/a>"],"photo_reference":"CmRaAAAA48plMBKg_0WUNt4FXDytvgsJVEK3jpRCYokb2-Xosh12EcV1L65ikVyVEg2ok--t-wdJPTu2PGJfI7J5E-Vo1bnsXO7o_LUyEozUc45utU8efNQr-g0lJm4fjvuNI3zSEhDbmMv6mb0_koN0ze_XxAPLGhSMYvhyUUs9oqfm6WVCiadABmiyeA","width":4128}]
         * place_id : ChIJPx-fXUImWhQRvyIxtxONNCE
         * plus_code : {"compound_code":"34P6+F4 Bani Sweif, Egypt","global_code":"7GXH34P6+F4"}
         * price_level : 2
         * rating : 4.1
         * reference : ChIJPx-fXUImWhQRvyIxtxONNCE
         * scope : GOOGLE
         * types : ["restaurant","food","point_of_interest","establishment"]
         * user_ratings_total : 540
         * vicinity : Qism Bani Sweif, Bani Sweif
         */

        private String business_status;
        private GeometryBean geometry;
        private String icon;
        private String name;
        private OpeningHoursBean opening_hours;
        private String place_id;
        private PlusCodeBean plus_code;
        private int price_level;
        private double rating;
        private String reference;
        private String scope;
        private int user_ratings_total;
        private String vicinity;
        private List<PhotosBean> photos;
        private List<String> types;

        public String getBusiness_status() {
            return business_status;
        }

        public void setBusiness_status(String business_status) {
            this.business_status = business_status;
        }

        public GeometryBean getGeometry() {
            return geometry;
        }

        public void setGeometry(GeometryBean geometry) {
            this.geometry = geometry;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public OpeningHoursBean getOpening_hours() {
            return opening_hours;
        }

        public void setOpening_hours(OpeningHoursBean opening_hours) {
            this.opening_hours = opening_hours;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public PlusCodeBean getPlus_code() {
            return plus_code;
        }

        public void setPlus_code(PlusCodeBean plus_code) {
            this.plus_code = plus_code;
        }

        public int getPrice_level() {
            return price_level;
        }

        public void setPrice_level(int price_level) {
            this.price_level = price_level;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public int getUser_ratings_total() {
            return user_ratings_total;
        }

        public void setUser_ratings_total(int user_ratings_total) {
            this.user_ratings_total = user_ratings_total;
        }

        public String getVicinity() {
            return vicinity;
        }

        public void setVicinity(String vicinity) {
            this.vicinity = vicinity;
        }

        public List<PhotosBean> getPhotos() {
            return photos;
        }

        public void setPhotos(List<PhotosBean> photos) {
            this.photos = photos;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public static class GeometryBean {
            /**
             * location : {"lat":29.0862473,"lng":31.1103687}
             * viewport : {"northeast":{"lat":29.0875806302915,"lng":31.1117892802915},"southwest":{"lat":29.0848826697085,"lng":31.1090913197085}}
             */

            private LocationBean location;
            private ViewportBean viewport;

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public ViewportBean getViewport() {
                return viewport;
            }

            public void setViewport(ViewportBean viewport) {
                this.viewport = viewport;
            }

            public static class LocationBean {
                /**
                 * lat : 29.0862473
                 * lng : 31.1103687
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class ViewportBean {
                /**
                 * northeast : {"lat":29.0875806302915,"lng":31.1117892802915}
                 * southwest : {"lat":29.0848826697085,"lng":31.1090913197085}
                 */

                private NortheastBean northeast;
                private SouthwestBean southwest;

                public NortheastBean getNortheast() {
                    return northeast;
                }

                public void setNortheast(NortheastBean northeast) {
                    this.northeast = northeast;
                }

                public SouthwestBean getSouthwest() {
                    return southwest;
                }

                public void setSouthwest(SouthwestBean southwest) {
                    this.southwest = southwest;
                }

                public static class NortheastBean {
                    /**
                     * lat : 29.0875806302915
                     * lng : 31.1117892802915
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class SouthwestBean {
                    /**
                     * lat : 29.0848826697085
                     * lng : 31.1090913197085
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }

        public static class OpeningHoursBean {
            /**
             * open_now : false
             */

            private boolean open_now;

            public boolean isOpen_now() {
                return open_now;
            }

            public void setOpen_now(boolean open_now) {
                this.open_now = open_now;
            }
        }

        public static class PlusCodeBean {
            /**
             * compound_code : 34P6+F4 Bani Sweif, Egypt
             * global_code : 7GXH34P6+F4
             */

            private String compound_code;
            private String global_code;

            public String getCompound_code() {
                return compound_code;
            }

            public void setCompound_code(String compound_code) {
                this.compound_code = compound_code;
            }

            public String getGlobal_code() {
                return global_code;
            }

            public void setGlobal_code(String global_code) {
                this.global_code = global_code;
            }
        }

        public static class PhotosBean {
            /**
             * height : 3096
             * html_attributions : ["<a href=\"https://maps.google.com/maps/contrib/104533697790012746376\">Shahd Alghazally<\/a>"]
             * photo_reference : CmRaAAAA48plMBKg_0WUNt4FXDytvgsJVEK3jpRCYokb2-Xosh12EcV1L65ikVyVEg2ok--t-wdJPTu2PGJfI7J5E-Vo1bnsXO7o_LUyEozUc45utU8efNQr-g0lJm4fjvuNI3zSEhDbmMv6mb0_koN0ze_XxAPLGhSMYvhyUUs9oqfm6WVCiadABmiyeA
             * width : 4128
             */

            private int height;
            private String photo_reference;
            private int width;
            private List<String> html_attributions;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getPhoto_reference() {
                return photo_reference;
            }

            public void setPhoto_reference(String photo_reference) {
                this.photo_reference = photo_reference;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<String> getHtml_attributions() {
                return html_attributions;
            }

            public void setHtml_attributions(List<String> html_attributions) {
                this.html_attributions = html_attributions;
            }
        }
    }
}
