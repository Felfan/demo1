package beans;

import java.util.List;

/**
 * Created by 房庆丰 on 2016/11/7.
 */
public class HomeInfo {

    /**
     * statusCode : 200
     * statusMsg : 获取成功！
     * result : {"moduleList":[{"web_id":"124","web_name":"首页促销区(使用)","style_name":"orange","web_page":"index","update_time":"1478483437","web_sort":"9","web_show":"1","web_html":null,"web_pic":null,"web_url":null,"web_cla":"1","bannerList":[{"banner_id":"1","banner_title":"办理会员卡","banner_url":"http://console.awu.cn/data/upload/home/index/aboutMember/","banner_img":"http://image.awu.cn/data/upload/shop/editor/20160914-18000169.jpg","banner_pic":"","banner_cla":"6"},{"banner_id":"2","banner_title":"非常大牌","banner_url":"http://console.awu.cn/shop/index.php?act=zts&zt_id=180","banner_img":"http://image.awu.cn/data/upload/shop/editor/20161008-09143194.jpg","banner_pic":"","banner_cla":"2"},{"banner_id":"3","banner_title":"聚便宜","banner_url":"http://console.awu.cn/shop/index.php?act=zts&zt_id=110","banner_img":"http://image.awu.cn/data/upload/shop/editor/20161008-09151481.jpg","banner_pic":"","banner_cla":"2"},{"banner_id":"4","banner_title":"特价清仓","banner_url":"http://console.awu.cn/shop/index.php?act=zts&zt_id=100","banner_img":"http://image.awu.cn/data/upload/shop/editor/20161008-09154661.jpg","banner_pic":"","banner_cla":"2"}]}]}
     * sign : V/SDM0EUWDtFCQ19UjCRuCIFDPezqSk1oeLwpADvORjUW50GBsaLnzlbxlHkq9ClTsnhNEUHRcQ6DrytS64rk7F6HetNp2Ya4O8Wz44Y39dhEOuwyinLApP59EJj66PFOzajda+9nuSi+RMnTg4aKemnE5sZ+v4MKzYl+g/gG5g=
     * timestamp : 1478505326
     */

    private int statusCode;
    private String statusMsg;
    private ResultBean result;
    private String sign;
    private int timestamp;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public static class ResultBean {
        /**
         * web_id : 124
         * web_name : 首页促销区(使用)
         * style_name : orange
         * web_page : index
         * update_time : 1478483437
         * web_sort : 9
         * web_show : 1
         * web_html : null
         * web_pic : null
         * web_url : null
         * web_cla : 1
         * bannerList : [{"banner_id":"1","banner_title":"办理会员卡","banner_url":"http://console.awu.cn/data/upload/home/index/aboutMember/","banner_img":"http://image.awu.cn/data/upload/shop/editor/20160914-18000169.jpg","banner_pic":"","banner_cla":"6"},{"banner_id":"2","banner_title":"非常大牌","banner_url":"http://console.awu.cn/shop/index.php?act=zts&zt_id=180","banner_img":"http://image.awu.cn/data/upload/shop/editor/20161008-09143194.jpg","banner_pic":"","banner_cla":"2"},{"banner_id":"3","banner_title":"聚便宜","banner_url":"http://console.awu.cn/shop/index.php?act=zts&zt_id=110","banner_img":"http://image.awu.cn/data/upload/shop/editor/20161008-09151481.jpg","banner_pic":"","banner_cla":"2"},{"banner_id":"4","banner_title":"特价清仓","banner_url":"http://console.awu.cn/shop/index.php?act=zts&zt_id=100","banner_img":"http://image.awu.cn/data/upload/shop/editor/20161008-09154661.jpg","banner_pic":"","banner_cla":"2"}]
         */

        private List<ModuleListBean> moduleList;

        public List<ModuleListBean> getModuleList() {
            return moduleList;
        }

        public void setModuleList(List<ModuleListBean> moduleList) {
            this.moduleList = moduleList;
        }

        public static class ModuleListBean {
            private String web_id;
            private String web_name;
            private String style_name;
            private String web_page;
            private String update_time;
            private String web_sort;
            private String web_show;
            private Object web_html;
            private Object web_pic;
            private Object web_url;
            private String web_cla;
            /**
             * banner_id : 1
             * banner_title : 办理会员卡
             * banner_url : http://console.awu.cn/data/upload/home/index/aboutMember/
             * banner_img : http://image.awu.cn/data/upload/shop/editor/20160914-18000169.jpg
             * banner_pic :
             * banner_cla : 6
             */

            private List<BannerListBean> bannerList;

            public String getWeb_id() {
                return web_id;
            }

            public void setWeb_id(String web_id) {
                this.web_id = web_id;
            }

            public String getWeb_name() {
                return web_name;
            }

            public void setWeb_name(String web_name) {
                this.web_name = web_name;
            }

            public String getStyle_name() {
                return style_name;
            }

            public void setStyle_name(String style_name) {
                this.style_name = style_name;
            }

            public String getWeb_page() {
                return web_page;
            }

            public void setWeb_page(String web_page) {
                this.web_page = web_page;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getWeb_sort() {
                return web_sort;
            }

            public void setWeb_sort(String web_sort) {
                this.web_sort = web_sort;
            }

            public String getWeb_show() {
                return web_show;
            }

            public void setWeb_show(String web_show) {
                this.web_show = web_show;
            }

            public Object getWeb_html() {
                return web_html;
            }

            public void setWeb_html(Object web_html) {
                this.web_html = web_html;
            }

            public Object getWeb_pic() {
                return web_pic;
            }

            public void setWeb_pic(Object web_pic) {
                this.web_pic = web_pic;
            }

            public Object getWeb_url() {
                return web_url;
            }

            public void setWeb_url(Object web_url) {
                this.web_url = web_url;
            }

            public String getWeb_cla() {
                return web_cla;
            }

            public void setWeb_cla(String web_cla) {
                this.web_cla = web_cla;
            }

            public List<BannerListBean> getBannerList() {
                return bannerList;
            }

            public void setBannerList(List<BannerListBean> bannerList) {
                this.bannerList = bannerList;
            }

            public static class BannerListBean {
                private String banner_id;
                private String banner_title;
                private String banner_url;
                private String banner_img;
                private String banner_pic;
                private String banner_cla;

                public String getBanner_id() {
                    return banner_id;
                }

                public void setBanner_id(String banner_id) {
                    this.banner_id = banner_id;
                }

                public String getBanner_title() {
                    return banner_title;
                }

                public void setBanner_title(String banner_title) {
                    this.banner_title = banner_title;
                }

                public String getBanner_url() {
                    return banner_url;
                }

                public void setBanner_url(String banner_url) {
                    this.banner_url = banner_url;
                }

                public String getBanner_img() {
                    return banner_img;
                }

                public void setBanner_img(String banner_img) {
                    this.banner_img = banner_img;
                }

                public String getBanner_pic() {
                    return banner_pic;
                }

                public void setBanner_pic(String banner_pic) {
                    this.banner_pic = banner_pic;
                }

                public String getBanner_cla() {
                    return banner_cla;
                }

                public void setBanner_cla(String banner_cla) {
                    this.banner_cla = banner_cla;
                }
            }
        }
    }
}
