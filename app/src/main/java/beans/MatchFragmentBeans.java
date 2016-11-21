package beans;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

import parsers.MatchResponseParser;

/**
 * Created by Yizhongli on 2016/11/7.
 */
@HttpResponse(parser = MatchResponseParser.class)
public class MatchFragmentBeans {

    /**
     * statusCode : 200
     * statusMsg : 获取成功！
     * result : {"special_top_two":[{"id":"54","title":"流行冬靴","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05318308942666874_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05318309202991483_1280.jpg","template_name":"fashoin-shoe","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1478486941","to_url":"http://console.awu.cn/data/upload/special/1478486941/fashoin-shoe.html"},{"id":"53","title":"我家宝贝还缺一件暖黄色大衣","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05309950765471782_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05309950875660368_1280.jpg","template_name":"warmyellowcoat","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1477651196","to_url":"http://console.awu.cn/data/upload/special/1477651196/warmyellowcoat.html"}],"goods_list":[{"goods_commonid":"10713","goods_name":"秋游聚会萌趣兔耳女童套装","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315929892674126_360.jpg","goods_price_member":"394.00","goods_price_nonMember":"556.00","goods_marketprice":"995.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10712","goods_name":"保暖趣味手绘风衣男童套装","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315926950840265_360.jpg","goods_price_member":"432.00","goods_price_nonMember":"586.00","goods_marketprice":"1016.00","return_price":"0.00","store_id":"1","goods_collect":"1","is_collected":0,"goods_single":"1"},{"goods_commonid":"10711","goods_name":"时尚军绿棒球服男童套装","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315924792730652_360.jpg","goods_price_member":"468.00","goods_price_nonMember":"716.00","goods_marketprice":"1414.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10673","goods_name":"户外必备潮流亮色男童套装","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315759305006397_360.jpg","goods_price_member":"520.00","goods_price_nonMember":"696.00","goods_marketprice":"1304.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10671","goods_name":"户外必备潮流亮色男童套装","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315756449717838_360.jpg","goods_price_member":"422.00","goods_price_nonMember":"626.00","goods_marketprice":"1164.00","return_price":"0.00","store_id":"1","goods_collect":"1","is_collected":0,"goods_single":"1"},{"goods_commonid":"10524","goods_name":"逛街必备 温暖时髦 女童搭配套装","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05314204053581906_360.jpg","goods_price_member":"888.00","goods_price_nonMember":"1295.00","goods_marketprice":"2532.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10523","goods_name":"逛街必备 温暖时髦 女童搭配套装","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05314202204601418_360.jpg","goods_price_member":"618.00","goods_price_nonMember":"825.00","goods_marketprice":"1563.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10522","goods_name":"户外时尚运动风 男童搭配套装","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05314199728452889_360.jpg","goods_price_member":"605.00","goods_price_nonMember":"795.00","goods_marketprice":"1683.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10521","goods_name":"户外时尚运动风 男童搭配套装","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05314195751355791_360.jpg","goods_price_member":"583.00","goods_price_nonMember":"885.00","goods_marketprice":"1649.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10375","goods_name":"搭配套装 男童 加厚休闲裤 韩版羽绒服 舒适针织衫 舒适运动鞋 四件套","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05313153602907529_360.jpg","goods_price_member":"730.00","goods_price_nonMember":"936.00","goods_marketprice":"1404.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10374","goods_name":"搭配套装 女童 舒适针织衫 毛呢外套 休闲牛仔裤 加绒雪地靴 四件套","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05313145836682996_360.jpg","goods_price_member":"540.00","goods_price_nonMember":"706.00","goods_marketprice":"1588.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10373","goods_name":"搭配套装 女童 舒适卫衣 加绒休闲裤 加绒休闲鞋 韩版羽绒服 四件套","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05313143580808616_360.jpg","goods_price_member":"528.00","goods_price_nonMember":"666.00","goods_marketprice":"1393.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10372","goods_name":"搭配套装 男童 加厚马甲 条纹纯棉T恤 休闲牛仔裤 加绒短靴 四件套","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05314028761573608_360.jpg","goods_price_member":"384.00","goods_price_nonMember":"546.00","goods_marketprice":"817.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10282","goods_name":"搭配套装 女童 时尚针织衫 百搭舒适半身裙 保暖舒适雪地靴 三件套","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05309922010925061_360.jpg","goods_price_member":"374.00","goods_price_nonMember":"497.00","goods_marketprice":"1149.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10281","goods_name":"搭配套装 男童 保暖棉服 休闲卫衣 舒适休闲裤 透气运动鞋 四件套","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05309918828831796_360.jpg","goods_price_member":"776.00","goods_price_nonMember":"1066.00","goods_marketprice":"1494.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10272","goods_name":"搭配套装 女童 高领针织衫 时尚毛呢外套 百搭背心裙 时尚公主靴 四件套","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05309703495865026_360.jpg","goods_price_member":"609.00","goods_price_nonMember":"836.00","goods_marketprice":"1504.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10270","goods_name":"搭配套装 女童 时尚连衣裙 舒适学步鞋 休闲外套 三件套","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05309700475303633_360.jpg","goods_price_member":"449.00","goods_price_nonMember":"557.00","goods_marketprice":"887.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10268","goods_name":"搭配套装 女童 纯棉衬衫 百搭打底裤 时尚棉服 舒适休闲鞋 四件套","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05309698422015479_360.jpg","goods_price_member":"491.00","goods_price_nonMember":"696.00","goods_marketprice":"1153.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10266","goods_name":"搭配套装 男童 纯棉卫衣 舒适加厚马甲 休闲牛仔裤 时尚帽子 舒适休闲鞋 五件套","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05309695544659489_360.jpg","goods_price_member":"504.00","goods_price_nonMember":"705.00","goods_marketprice":"1265.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"},{"goods_commonid":"10263","goods_name":"搭配套装 男童 纯棉卫衣 保暖羽绒服 休闲牛仔裤 加绒马丁靴 四件套","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05309693084281267_360.jpg","goods_price_member":"578.00","goods_price_nonMember":"926.00","goods_marketprice":"1772.00","return_price":"0.00","store_id":"1","goods_collect":"0","is_collected":0,"goods_single":"1"}]}
     * sign : Gx57M+5kR4wOjzfhPJZMWSfFnI3pP+Q4XgFL/QilKZxAhh1Im1ZkFQAo2YhS0Qj62550IY9F2/NC6DD2ruywUWfBRQlVWYpA7ORw7QsJQoEbPW+oNOCX/QSrutRiStqsPWztIce/TLLnrN9lBWegSWmy7bVRnxRj0aQGn8oNO2k=
     * timestamp : 1478511362
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
         * id : 54
         * title : 流行冬靴
         * pic_little : http://image.awu.cn/data/upload/shop/store/goods/1/1_05318308942666874_360.jpg
         * pic_brand : http://image.awu.cn/data/upload/shop/store/goods/1/1_05318309202991483_1280.jpg
         * template_name : fashoin-shoe
         * store_id : 1
         * sort : 1
         * recommend : 1
         * status : 1
         * insert_time : 1478486941
         * to_url : http://console.awu.cn/data/upload/special/1478486941/fashoin-shoe.html
         */

        private List<SpecialTopTwoBean> special_top_two;
        /**
         * goods_commonid : 10713
         * goods_name : 秋游聚会萌趣兔耳女童套装
         * goods_image : http://image.awu.cn/data/upload/shop/store/goods/1/1_05315929892674126_360.jpg
         * goods_price_member : 394.00
         * goods_price_nonMember : 556.00
         * goods_marketprice : 995.00
         * return_price : 0.00
         * store_id : 1
         * goods_collect : 0
         * is_collected : 0
         * goods_single : 1
         */

        private List<GoodsListBean> goods_list;

        public List<SpecialTopTwoBean> getSpecial_top_two() {
            return special_top_two;
        }

        public void setSpecial_top_two(List<SpecialTopTwoBean> special_top_two) {
            this.special_top_two = special_top_two;
        }

        public List<GoodsListBean> getGoods_list() {
            return goods_list;
        }

        public void setGoods_list(List<GoodsListBean> goods_list) {
            this.goods_list = goods_list;
        }

        public static class SpecialTopTwoBean {
            private String id;
            private String title;
            private String pic_little;
            private String pic_brand;
            private String template_name;
            private String store_id;
            private String sort;
            private String recommend;
            private String status;
            private String insert_time;
            private String to_url;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPic_little() {
                return pic_little;
            }

            public void setPic_little(String pic_little) {
                this.pic_little = pic_little;
            }

            public String getPic_brand() {
                return pic_brand;
            }

            public void setPic_brand(String pic_brand) {
                this.pic_brand = pic_brand;
            }

            public String getTemplate_name() {
                return template_name;
            }

            public void setTemplate_name(String template_name) {
                this.template_name = template_name;
            }

            public String getStore_id() {
                return store_id;
            }

            public void setStore_id(String store_id) {
                this.store_id = store_id;
            }

            public String getSort() {
                return sort;
            }

            public void setSort(String sort) {
                this.sort = sort;
            }

            public String getRecommend() {
                return recommend;
            }

            public void setRecommend(String recommend) {
                this.recommend = recommend;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getInsert_time() {
                return insert_time;
            }

            public void setInsert_time(String insert_time) {
                this.insert_time = insert_time;
            }

            public String getTo_url() {
                return to_url;
            }

            public void setTo_url(String to_url) {
                this.to_url = to_url;
            }
        }

        public static class GoodsListBean {
            private String goods_commonid;
            private String goods_name;
            private String goods_image;
            private String goods_price_member;
            private String goods_price_nonMember;
            private String goods_marketprice;
            private String return_price;
            private String store_id;
            private String goods_collect;
            private int is_collected;
            private String goods_single;

            public String getGoods_commonid() {
                return goods_commonid;
            }

            public void setGoods_commonid(String goods_commonid) {
                this.goods_commonid = goods_commonid;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public String getGoods_image() {
                return goods_image;
            }

            public void setGoods_image(String goods_image) {
                this.goods_image = goods_image;
            }

            public String getGoods_price_member() {
                return goods_price_member;
            }

            public void setGoods_price_member(String goods_price_member) {
                this.goods_price_member = goods_price_member;
            }

            public String getGoods_price_nonMember() {
                return goods_price_nonMember;
            }

            public void setGoods_price_nonMember(String goods_price_nonMember) {
                this.goods_price_nonMember = goods_price_nonMember;
            }

            public String getGoods_marketprice() {
                return goods_marketprice;
            }

            public void setGoods_marketprice(String goods_marketprice) {
                this.goods_marketprice = goods_marketprice;
            }

            public String getReturn_price() {
                return return_price;
            }

            public void setReturn_price(String return_price) {
                this.return_price = return_price;
            }

            public String getStore_id() {
                return store_id;
            }

            public void setStore_id(String store_id) {
                this.store_id = store_id;
            }

            public String getGoods_collect() {
                return goods_collect;
            }

            public void setGoods_collect(String goods_collect) {
                this.goods_collect = goods_collect;
            }

            public int getIs_collected() {
                return is_collected;
            }

            public void setIs_collected(int is_collected) {
                this.is_collected = is_collected;
            }

            public String getGoods_single() {
                return goods_single;
            }

            public void setGoods_single(String goods_single) {
                this.goods_single = goods_single;
            }
        }
    }
}
