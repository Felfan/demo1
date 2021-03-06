package beans;

import android.graphics.Paint;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

import parsers.MatchResponseParser;

/**
 * Created by Yizhongli on 2016/11/8.
 */
@HttpResponse(parser = MatchResponseParser.class)
public class MatchCheckAllBeans {

    /**
     * statusCode : 200
     * statusMsg : 获取成功！
     * result : [{"id":"54","title":"流行冬靴","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05318308942666874_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05318309202991483_1280.jpg","template_name":"fashoin-shoe","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1478486941","to_url":"http://console.awu.cn/data/upload/special/1478486941/fashoin-shoe.html"},{"id":"53","title":"我家宝贝还缺一件暖黄色大衣","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05309950765471782_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05309950875660368_1280.jpg","template_name":"warmyellowcoat","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1477651196","to_url":"http://console.awu.cn/data/upload/special/1477651196/warmyellowcoat.html"},{"id":"52","title":"爸爸去哪儿-拼接展示","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05303922243821221_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05303922311337470_1280.jpg","template_name":"wheredadgo","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1477048282","to_url":"http://console.awu.cn/data/upload/special/1477048282/wheredadgo.html"},{"id":"51","title":"运动裤搭配专题","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05298717378138826_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05298717263301137_1280.jpg","template_name":"sportpants","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1476441971","to_url":"http://console.awu.cn/data/upload/special/1476441971/sportpants.html"},{"id":"50","title":"Instagram推荐-婴幼儿（0-3岁）搭配志","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05296698627574265_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05296698677283342_1280.jpg","template_name":"Instagram","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1476325920","to_url":"http://console.awu.cn/data/upload/special/1476325920/Instagram.html"},{"id":"49","title":"亲子装","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05285665390399823_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05285665481256939_1280.jpg","template_name":"parent_child","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1475222594","to_url":"http://console.awu.cn/data/upload/special/1475222594/parent_child.html"},{"id":"48","title":"潮图来袭","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05279702061351109_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05279702166081191_1280.jpg","template_name":"pattern","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1474626296","to_url":"http://console.awu.cn/data/upload/special/1474626296/pattern.html"},{"id":"47","title":"复古look","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05271959534098296_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05271959723843671_1280.jpg","template_name":"fugulook","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1473851992","to_url":"http://console.awu.cn/data/upload/special/1473851992/fugulook.html"},{"id":"46","title":"开学必备8款运动鞋","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05259822357433924_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05259822558930592_1280.jpg","template_name":"gosporty","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1472638267","to_url":"http://console.awu.cn/data/upload/special/1472638267/gosporty.html"},{"id":"44","title":"校队运动夹克","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05255584063010564_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05255584128143626_1280.jpg","template_name":"tinified","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1472214445","to_url":"http://console.awu.cn/data/upload/special/1472214445/tinified.html"},{"id":"43","title":"返校季.时髦新衣花样穿","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05249464657430468_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05249464748995387_1280.jpg","template_name":"backtoschool","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1471602509","to_url":"http://console.awu.cn/data/upload/special/1471602509/backtoschool.html"},{"id":"42","title":"早秋搭配专题","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05243333527494377_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05243333855482995_1280.jpg","template_name":"prefall","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1470989395","to_url":"http://console.awu.cn/data/upload/special/1470989395/prefall.html"},{"id":"41","title":"出国玩的正确穿搭","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05238200647374229_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05238200939647406_1280.jpg","template_name":"chuguoyou","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1470476108","to_url":"http://console.awu.cn/data/upload/special/1470476108/chuguoyou.html"},{"id":"40","title":"桑拿天搭配专题","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05237430907899478_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05237430972979873_1280.jpg","template_name":"hotday","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1470399130","to_url":"http://console.awu.cn/data/upload/special/1470399130/hotday.html"},{"id":"39","title":"冰淇淋撞色夏天","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05231338735485087_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05231339054358309_1280.jpg","template_name":"icream","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1469789971","to_url":"http://console.awu.cn/data/upload/special/1469789971/icream.html"},{"id":"38","title":"萌宝奇遇记","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05225337919544541_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05225339614198030_1280.jpg","template_name":"baby","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1469189989","to_url":"http://console.awu.cn/data/upload/special/1469189989/baby.html"},{"id":"37","title":"潮童课堂 古镇游","pic_little":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05224372551792542_360.jpg","pic_brand":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05223556911692325_1280.jpg","template_name":"city","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1469011728","to_url":"http://console.awu.cn/data/upload/special/1469011728/city.html"},{"id":"36","title":"百元主题搭配","pic_little":"http://console.awu.cn/data/upload/shop/store/goods/1/1_05219252232264970_360.jpg","pic_brand":"http://console.awu.cn/data/upload/shop/store/goods/1/1_05219252840772981_1280.jpg","template_name":"baiyuanzhuti","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1468581303","to_url":"http://console.awu.cn/data/upload/special/1468581303/baiyuanzhuti.html"},{"id":"35","title":"清凉牛仔","pic_little":"http://console.awu.cn/data/upload/shop/store/goods/1/1_05213231419756179_360.jpg","pic_brand":"http://console.awu.cn/data/upload/shop/store/goods/1/1_05213231523091917_1280.jpg","template_name":"coolcowboy","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1467979169","to_url":"http://console.awu.cn/data/upload/special/1467979169/coolcowboy.html"},{"id":"33","title":"夏日T恤狂潮","pic_little":"http://console.awu.cn/data/upload/shop/store/goods/1/1_05207182033671446_360.jpg","pic_brand":"http://console.awu.cn/data/upload/shop/store/goods/1/1_05207182079295728_1280.gif","template_name":"summer","store_id":"1","sort":"1","recommend":"1","status":"1","insert_time":"1467374228","to_url":"http://console.awu.cn/data/upload/special/1467374228/summer.html"}]
     * sign : DxbjfQotKE/HxN4XVWZxvQ/STbsmSxy/85FU9VBb5Y4e1ufCdTHmIFD4Yiqv/K0l7eeC19CynEP1EXZX+F0xk+3hAtsscDTVjKK4heFOBsJizPPx8+R6+VKSmGq1aWuSA2vEGJtXV047reB4Gf6EuUJnLIaNF1fFXtZN81xH8oM=
     * timestamp : 1478571581
     */

    private int statusCode;
    private String statusMsg;
    private String sign;
    private int timestamp;
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

    private List<ResultBean> result;

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

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
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
}
