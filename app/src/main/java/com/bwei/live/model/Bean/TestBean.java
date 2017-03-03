package com.bwei.live.model.Bean;

import java.util.List;

/**
 * Created by zhang on 2017/2/20.
 */

public class TestBean{


        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 05977df2a0d58fff954a23a132fddf86
             * title : 首个拿到LV奖学金的中国人，世界大牌排队找他合作……这个浙江小伙最近红得不要不要的
             * date : 2017-02-20 18:48
             * category : 头条
             * author_name : 都市快报
             * url : http://mini.eastday.com/mobile/170220184844721.html
             * thumbnail_pic_s : http://09.imgmini.eastday.com/mobile/20170220/20170220184844_59606df189d9318885add2a87bca36f8_1_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://09.imgmini.eastday.com/mobile/20170220/20170220184844_59606df189d9318885add2a87bca36f8_2_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://09.imgmini.eastday.com/mobile/20170220/20170220184844_59606df189d9318885add2a87bca36f8_3_mwpm_03200403.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }

