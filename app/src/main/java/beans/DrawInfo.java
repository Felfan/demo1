package beans;

import java.util.List;

/**
 * Created by 房庆丰 on 2016/11/8.
 */
public class DrawInfo {

    /**
     * statusCode : 200
     * statusMsg : 获取成功！
     * result : {"goods_class":{"class1":[{"gc_id":"1","gc_name":"童装服饰","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-1.jpg","class2":[{"gc_id":"68","gc_name":"婴幼儿","type_id":"1","pic":"","class3":[{"gc_id":"106","gc_name":"罩衣围嘴","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-106.jpg"},{"gc_id":"102","gc_name":"婴儿内衣","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-102.jpg"},{"gc_id":"69","gc_name":"爬爬服","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-69.jpg"},{"gc_id":"103","gc_name":"婴儿礼盒","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-103.jpg"},{"gc_id":"71","gc_name":"婴儿帽子","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-71.jpg"},{"gc_id":"105","gc_name":"手脚套","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-105.jpg"},{"gc_id":"104","gc_name":"睡袋","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-104.jpg"},{"gc_id":"112","gc_name":"床品","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-112.jpg"}]},{"gc_id":"82","gc_name":"亲子装","type_id":"1","pic":""},{"gc_id":"2","gc_name":"上装","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-2.jpg","class3":[{"gc_id":"7","gc_name":"T恤","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-7.jpg"},{"gc_id":"8","gc_name":"衬衫","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-8.jpg"},{"gc_id":"42","gc_name":"卫衣","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-42.jpg"},{"gc_id":"9","gc_name":"针织衫","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-9.jpg"},{"gc_id":"10","gc_name":"马甲","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-10.jpg"},{"gc_id":"76","gc_name":"夹克","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-76.jpg"},{"gc_id":"11","gc_name":"外套","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-11.jpg"},{"gc_id":"75","gc_name":"风衣","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-75.jpg"},{"gc_id":"111","gc_name":"西服","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-111.jpg"},{"gc_id":"12","gc_name":"羽绒服","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-12.jpg"},{"gc_id":"48","gc_name":"棉衣","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-48.jpg"},{"gc_id":"65","gc_name":"背心","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-65.jpg"},{"gc_id":"108","gc_name":"防晒服","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-108.jpg"}]},{"gc_id":"3","gc_name":"下装","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-3.jpg","class3":[{"gc_id":"16","gc_name":"休闲裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-16.jpg"},{"gc_id":"15","gc_name":"牛仔裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-15.jpg"},{"gc_id":"14","gc_name":"运动裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-14.jpg"},{"gc_id":"85","gc_name":"连体裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-85.jpg"},{"gc_id":"13","gc_name":"打底裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-13.jpg"},{"gc_id":"18","gc_name":"裙裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-18.jpg"},{"gc_id":"84","gc_name":"短裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-84.jpg"}]},{"gc_id":"81","gc_name":"裙装","type_id":"1","pic":"","class3":[{"gc_id":"86","gc_name":"半身裙","type_id":"1","gc_parent_id":"81","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-86.jpg"},{"gc_id":"87","gc_name":"连衣裙","type_id":"1","gc_parent_id":"81","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-87.jpg"},{"gc_id":"88","gc_name":"礼服裙","type_id":"1","gc_parent_id":"81","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-88.jpg"}]},{"gc_id":"38","gc_name":"套装","type_id":"1","pic":"","class3":[{"gc_id":"99","gc_name":"休闲套装","type_id":"1","gc_parent_id":"38","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-99.jpg"},{"gc_id":"90","gc_name":"运动套装","type_id":"1","gc_parent_id":"38","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-90.jpg"},{"gc_id":"91","gc_name":"礼服套装","type_id":"1","gc_parent_id":"38","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-91.jpg"},{"gc_id":"89","gc_name":"泳装","type_id":"1","gc_parent_id":"38","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-89.jpg"}]},{"gc_id":"83","gc_name":"家居服","type_id":"1","pic":"","class3":[{"gc_id":"92","gc_name":"睡衣","type_id":"1","gc_parent_id":"83","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-92.jpg"},{"gc_id":"93","gc_name":"内衣裤","type_id":"1","gc_parent_id":"83","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-93.jpg"}]},{"gc_id":"5","gc_name":"鞋靴","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-5.jpg","class3":[{"gc_id":"45","gc_name":"棉鞋/靴子","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-45.jpg"},{"gc_id":"95","gc_name":"毛毛虫","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-95.jpg"},{"gc_id":"22","gc_name":"运动鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-22.jpg"},{"gc_id":"96","gc_name":"帆布鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-96.jpg"},{"gc_id":"61","gc_name":"凉鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-61.jpg"},{"gc_id":"23","gc_name":"休闲鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-23.jpg"},{"gc_id":"53","gc_name":"皮鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-53.jpg"},{"gc_id":"24","gc_name":"学步鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-24.jpg"},{"gc_id":"110","gc_name":"户外鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-110.jpg"},{"gc_id":"109","gc_name":"家居鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-109.jpg"}]},{"gc_id":"6","gc_name":"配饰","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-6.jpg","class3":[{"gc_id":"114","gc_name":"妈咪包袋","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-114.jpg"},{"gc_id":"26","gc_name":"帽子","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-26.jpg"},{"gc_id":"57","gc_name":"头饰","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-57.jpg"},{"gc_id":"25","gc_name":"袜子","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-25.jpg"},{"gc_id":"115","gc_name":"斜挎包","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-115.jpg"},{"gc_id":"63","gc_name":"书包","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-63.jpg"},{"gc_id":"28","gc_name":"围巾","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-28.jpg"},{"gc_id":"29","gc_name":"手套","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-29.jpg"},{"gc_id":"98","gc_name":"其他","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-98.jpg"}]},{"gc_id":"116","gc_name":"玩具教辅","type_id":"1","pic":"","class3":[{"gc_id":"117","gc_name":"布书","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-117.jpg"},{"gc_id":"118","gc_name":"咬咬胶","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-118.jpg"},{"gc_id":"123","gc_name":"毛绒/安抚","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-123.jpg"},{"gc_id":"119","gc_name":"摇铃/床挂","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-119.jpg"},{"gc_id":"120","gc_name":"益智","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-120.jpg"},{"gc_id":"121","gc_name":"健身架","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-121.jpg"},{"gc_id":"122","gc_name":"爬行垫","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-122.jpg"},{"gc_id":"124","gc_name":"字帖","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-124.jpg"},{"gc_id":"125","gc_name":"笔袋文具","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-125.jpg"},{"gc_id":"126","gc_name":"玩具礼盒","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-126.jpg"}]},{"gc_id":"4","gc_name":"搭配","type_id":"1","pic":""}]}]},"goods_attr":[{"attr_id":"1","attr_name":"性别","type_id":"1","attr_value_arr":[{"attr_value_id":"1","attr_value_name":"男"},{"attr_value_id":"2","attr_value_name":"女"},{"attr_value_id":"40","attr_value_name":"男女"}]},{"attr_id":"11","attr_name":"年份","type_id":"1","attr_value_arr":[{"attr_value_id":"37","attr_value_name":"15冬"},{"attr_value_id":"38","attr_value_name":"16春"},{"attr_value_id":"39","attr_value_name":"16夏"},{"attr_value_id":"47","attr_value_name":"16秋"},{"attr_value_id":"49","attr_value_name":"16冬"}]}],"brand_related":[{"brand_id":"3","brand_name":"adidas","brand_class":"童装服饰","brand_pic":"http://image.awu.cn/data/upload/shop/brand/05019495567736280_sm.png","class_id":"1"},{"brand_id":"4","brand_name":"Balabala","brand_class":"上装","brand_pic":"http://image.awu.cn/data/upload/shop/brand/05019513537149132_sm.png","class_id":"2"},{"brand_id":"17","brand_name":"基诺浦","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"18","brand_name":"惠步舒","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"19","brand_name":"百丽","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"20","brand_name":"天美意","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"21","brand_name":"思加图","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"22","brand_name":"经典泰迪","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"23","brand_name":"南极人","brand_class":"","brand_pic":"http://image.awu.cn/data/upload/shop/brand/05019348768095096_sm.png","class_id":"0"},{"brand_id":"24","brand_name":"流浪熊","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"27","brand_name":"啊屋品牌","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"38","brand_name":"芭比","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"39","brand_name":"迪士尼（不用）","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"40","brand_name":"小熊维尼","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"41","brand_name":"马克珍妮","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"42","brand_name":"铭佳童话","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"43","brand_name":"jeep","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"44","brand_name":"纯一良品","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"45","brand_name":"季季乐","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"46","brand_name":"布衣草人","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"47","brand_name":"马拉丁","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"48","brand_name":"EYAS","brand_class":"童装服饰","brand_pic":"http://image.awu.cn/data/upload/shop/brand/05090175100555057_sm.png","class_id":"1"},{"brand_id":"49","brand_name":"玛米玛卡","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"50","brand_name":"361°","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"51","brand_name":"丹尼熊","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"52","brand_name":"人本","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"53","brand_name":"耐克","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"54","brand_name":"保罗","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"55","brand_name":"暇步士","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"56","brand_name":"米妮哈鲁","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"57","brand_name":"麦西西","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"58","brand_name":"要要","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"59","brand_name":"哆啦A梦","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"60","brand_name":"爱制造","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"61","brand_name":"迪士尼","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"62","brand_name":"摩登小姐","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"63","brand_name":"NKO","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"64","brand_name":"adidas Originals","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"65","brand_name":"杰米小熊","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"66","brand_name":"巴布豆","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"67","brand_name":"Hello Kitty","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"68","brand_name":"苏斯","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"69","brand_name":"德萨","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"70","brand_name":"欧洲宝贝","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"71","brand_name":"史努比","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"72","brand_name":"帕傲","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"73","brand_name":"媛媛公主","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"74","brand_name":"妞妞家族","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"75","brand_name":"乐客友联","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"76","brand_name":"斯纳菲","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"77","brand_name":"阿杰邦尼","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"78","brand_name":"米奇丁当","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"79","brand_name":"柒步独舞","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"80","brand_name":"贝贝","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"81","brand_name":"梦多多","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"82","brand_name":"minibalabala","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"83","brand_name":"小素材","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"84","brand_name":"贝优可","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"85","brand_name":"爱拉曼","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"86","brand_name":"米菲","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"87","brand_name":"JOJO","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"88","brand_name":"kiddyears","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"89","brand_name":"小米米","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"90","brand_name":"伊诺贝儿","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"91","brand_name":"babybubbles","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"92","brand_name":"法纳贝儿","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"93","brand_name":"卡赛欧","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"94","brand_name":"仁新","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"95","brand_name":"哈佛大学","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"96","brand_name":"西瓜太郎","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"97","brand_name":"迪士尼宝宝","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"98","brand_name":"贝贝帕克","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"99","brand_name":"DiDihouse","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"100","brand_name":"大嘴猴","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"101","brand_name":"佳林贝贝","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"102","brand_name":"TU缇柚","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"103","brand_name":"品轩阁","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"104","brand_name":"Lalababy","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"105","brand_name":"吧吖吧吖","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"106","brand_name":"领先","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"107","brand_name":"金洋创意","brand_class":"","brand_pic":"http://image.awu.cn/data/upload/shop/brand/05309867903906434_sm.jpg","class_id":"0"}]}
     * sign : BmFF7KxGNNksOwo8D2/y005fXiD92BfddhDrEvRaxmWrspLhO5H7MO/NSbVnP300agLXPvIYdKN2tfGch/3GmUYwmS9xvMrA9gk+Y3uesB256C5SCDyU3P7dJup4Ew4d8xS59goBsPZctp6TsRVHkLcbUaEpENE0sVeDOGbWnHs=
     * timestamp : 1478611456
     */

    private int statusCode;
    private String statusMsg;
    /**
     * goods_class : {"class1":[{"gc_id":"1","gc_name":"童装服饰","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-1.jpg","class2":[{"gc_id":"68","gc_name":"婴幼儿","type_id":"1","pic":"","class3":[{"gc_id":"106","gc_name":"罩衣围嘴","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-106.jpg"},{"gc_id":"102","gc_name":"婴儿内衣","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-102.jpg"},{"gc_id":"69","gc_name":"爬爬服","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-69.jpg"},{"gc_id":"103","gc_name":"婴儿礼盒","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-103.jpg"},{"gc_id":"71","gc_name":"婴儿帽子","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-71.jpg"},{"gc_id":"105","gc_name":"手脚套","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-105.jpg"},{"gc_id":"104","gc_name":"睡袋","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-104.jpg"},{"gc_id":"112","gc_name":"床品","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-112.jpg"}]},{"gc_id":"82","gc_name":"亲子装","type_id":"1","pic":""},{"gc_id":"2","gc_name":"上装","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-2.jpg","class3":[{"gc_id":"7","gc_name":"T恤","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-7.jpg"},{"gc_id":"8","gc_name":"衬衫","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-8.jpg"},{"gc_id":"42","gc_name":"卫衣","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-42.jpg"},{"gc_id":"9","gc_name":"针织衫","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-9.jpg"},{"gc_id":"10","gc_name":"马甲","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-10.jpg"},{"gc_id":"76","gc_name":"夹克","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-76.jpg"},{"gc_id":"11","gc_name":"外套","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-11.jpg"},{"gc_id":"75","gc_name":"风衣","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-75.jpg"},{"gc_id":"111","gc_name":"西服","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-111.jpg"},{"gc_id":"12","gc_name":"羽绒服","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-12.jpg"},{"gc_id":"48","gc_name":"棉衣","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-48.jpg"},{"gc_id":"65","gc_name":"背心","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-65.jpg"},{"gc_id":"108","gc_name":"防晒服","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-108.jpg"}]},{"gc_id":"3","gc_name":"下装","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-3.jpg","class3":[{"gc_id":"16","gc_name":"休闲裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-16.jpg"},{"gc_id":"15","gc_name":"牛仔裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-15.jpg"},{"gc_id":"14","gc_name":"运动裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-14.jpg"},{"gc_id":"85","gc_name":"连体裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-85.jpg"},{"gc_id":"13","gc_name":"打底裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-13.jpg"},{"gc_id":"18","gc_name":"裙裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-18.jpg"},{"gc_id":"84","gc_name":"短裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-84.jpg"}]},{"gc_id":"81","gc_name":"裙装","type_id":"1","pic":"","class3":[{"gc_id":"86","gc_name":"半身裙","type_id":"1","gc_parent_id":"81","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-86.jpg"},{"gc_id":"87","gc_name":"连衣裙","type_id":"1","gc_parent_id":"81","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-87.jpg"},{"gc_id":"88","gc_name":"礼服裙","type_id":"1","gc_parent_id":"81","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-88.jpg"}]},{"gc_id":"38","gc_name":"套装","type_id":"1","pic":"","class3":[{"gc_id":"99","gc_name":"休闲套装","type_id":"1","gc_parent_id":"38","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-99.jpg"},{"gc_id":"90","gc_name":"运动套装","type_id":"1","gc_parent_id":"38","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-90.jpg"},{"gc_id":"91","gc_name":"礼服套装","type_id":"1","gc_parent_id":"38","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-91.jpg"},{"gc_id":"89","gc_name":"泳装","type_id":"1","gc_parent_id":"38","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-89.jpg"}]},{"gc_id":"83","gc_name":"家居服","type_id":"1","pic":"","class3":[{"gc_id":"92","gc_name":"睡衣","type_id":"1","gc_parent_id":"83","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-92.jpg"},{"gc_id":"93","gc_name":"内衣裤","type_id":"1","gc_parent_id":"83","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-93.jpg"}]},{"gc_id":"5","gc_name":"鞋靴","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-5.jpg","class3":[{"gc_id":"45","gc_name":"棉鞋/靴子","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-45.jpg"},{"gc_id":"95","gc_name":"毛毛虫","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-95.jpg"},{"gc_id":"22","gc_name":"运动鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-22.jpg"},{"gc_id":"96","gc_name":"帆布鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-96.jpg"},{"gc_id":"61","gc_name":"凉鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-61.jpg"},{"gc_id":"23","gc_name":"休闲鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-23.jpg"},{"gc_id":"53","gc_name":"皮鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-53.jpg"},{"gc_id":"24","gc_name":"学步鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-24.jpg"},{"gc_id":"110","gc_name":"户外鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-110.jpg"},{"gc_id":"109","gc_name":"家居鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-109.jpg"}]},{"gc_id":"6","gc_name":"配饰","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-6.jpg","class3":[{"gc_id":"114","gc_name":"妈咪包袋","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-114.jpg"},{"gc_id":"26","gc_name":"帽子","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-26.jpg"},{"gc_id":"57","gc_name":"头饰","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-57.jpg"},{"gc_id":"25","gc_name":"袜子","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-25.jpg"},{"gc_id":"115","gc_name":"斜挎包","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-115.jpg"},{"gc_id":"63","gc_name":"书包","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-63.jpg"},{"gc_id":"28","gc_name":"围巾","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-28.jpg"},{"gc_id":"29","gc_name":"手套","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-29.jpg"},{"gc_id":"98","gc_name":"其他","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-98.jpg"}]},{"gc_id":"116","gc_name":"玩具教辅","type_id":"1","pic":"","class3":[{"gc_id":"117","gc_name":"布书","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-117.jpg"},{"gc_id":"118","gc_name":"咬咬胶","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-118.jpg"},{"gc_id":"123","gc_name":"毛绒/安抚","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-123.jpg"},{"gc_id":"119","gc_name":"摇铃/床挂","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-119.jpg"},{"gc_id":"120","gc_name":"益智","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-120.jpg"},{"gc_id":"121","gc_name":"健身架","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-121.jpg"},{"gc_id":"122","gc_name":"爬行垫","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-122.jpg"},{"gc_id":"124","gc_name":"字帖","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-124.jpg"},{"gc_id":"125","gc_name":"笔袋文具","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-125.jpg"},{"gc_id":"126","gc_name":"玩具礼盒","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-126.jpg"}]},{"gc_id":"4","gc_name":"搭配","type_id":"1","pic":""}]}]}
     * goods_attr : [{"attr_id":"1","attr_name":"性别","type_id":"1","attr_value_arr":[{"attr_value_id":"1","attr_value_name":"男"},{"attr_value_id":"2","attr_value_name":"女"},{"attr_value_id":"40","attr_value_name":"男女"}]},{"attr_id":"11","attr_name":"年份","type_id":"1","attr_value_arr":[{"attr_value_id":"37","attr_value_name":"15冬"},{"attr_value_id":"38","attr_value_name":"16春"},{"attr_value_id":"39","attr_value_name":"16夏"},{"attr_value_id":"47","attr_value_name":"16秋"},{"attr_value_id":"49","attr_value_name":"16冬"}]}]
     * brand_related : [{"brand_id":"3","brand_name":"adidas","brand_class":"童装服饰","brand_pic":"http://image.awu.cn/data/upload/shop/brand/05019495567736280_sm.png","class_id":"1"},{"brand_id":"4","brand_name":"Balabala","brand_class":"上装","brand_pic":"http://image.awu.cn/data/upload/shop/brand/05019513537149132_sm.png","class_id":"2"},{"brand_id":"17","brand_name":"基诺浦","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"18","brand_name":"惠步舒","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"19","brand_name":"百丽","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"20","brand_name":"天美意","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"21","brand_name":"思加图","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"22","brand_name":"经典泰迪","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"23","brand_name":"南极人","brand_class":"","brand_pic":"http://image.awu.cn/data/upload/shop/brand/05019348768095096_sm.png","class_id":"0"},{"brand_id":"24","brand_name":"流浪熊","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"27","brand_name":"啊屋品牌","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"38","brand_name":"芭比","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"39","brand_name":"迪士尼（不用）","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"40","brand_name":"小熊维尼","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"41","brand_name":"马克珍妮","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"42","brand_name":"铭佳童话","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"43","brand_name":"jeep","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"44","brand_name":"纯一良品","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"45","brand_name":"季季乐","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"46","brand_name":"布衣草人","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"47","brand_name":"马拉丁","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"48","brand_name":"EYAS","brand_class":"童装服饰","brand_pic":"http://image.awu.cn/data/upload/shop/brand/05090175100555057_sm.png","class_id":"1"},{"brand_id":"49","brand_name":"玛米玛卡","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"50","brand_name":"361°","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"51","brand_name":"丹尼熊","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"52","brand_name":"人本","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"53","brand_name":"耐克","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"54","brand_name":"保罗","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"55","brand_name":"暇步士","brand_class":"鞋靴","brand_pic":"","class_id":"5"},{"brand_id":"56","brand_name":"米妮哈鲁","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"57","brand_name":"麦西西","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"58","brand_name":"要要","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"59","brand_name":"哆啦A梦","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"60","brand_name":"爱制造","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"61","brand_name":"迪士尼","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"62","brand_name":"摩登小姐","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"63","brand_name":"NKO","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"64","brand_name":"adidas Originals","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"65","brand_name":"杰米小熊","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"66","brand_name":"巴布豆","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"67","brand_name":"Hello Kitty","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"68","brand_name":"苏斯","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"69","brand_name":"德萨","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"70","brand_name":"欧洲宝贝","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"71","brand_name":"史努比","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"72","brand_name":"帕傲","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"73","brand_name":"媛媛公主","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"74","brand_name":"妞妞家族","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"75","brand_name":"乐客友联","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"76","brand_name":"斯纳菲","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"77","brand_name":"阿杰邦尼","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"78","brand_name":"米奇丁当","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"79","brand_name":"柒步独舞","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"80","brand_name":"贝贝","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"81","brand_name":"梦多多","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"82","brand_name":"minibalabala","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"83","brand_name":"小素材","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"84","brand_name":"贝优可","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"85","brand_name":"爱拉曼","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"86","brand_name":"米菲","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"87","brand_name":"JOJO","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"88","brand_name":"kiddyears","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"89","brand_name":"小米米","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"90","brand_name":"伊诺贝儿","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"91","brand_name":"babybubbles","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"92","brand_name":"法纳贝儿","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"93","brand_name":"卡赛欧","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"94","brand_name":"仁新","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"95","brand_name":"哈佛大学","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"96","brand_name":"西瓜太郎","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"97","brand_name":"迪士尼宝宝","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"98","brand_name":"贝贝帕克","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"99","brand_name":"DiDihouse","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"100","brand_name":"大嘴猴","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"101","brand_name":"佳林贝贝","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"102","brand_name":"TU缇柚","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"103","brand_name":"品轩阁","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"104","brand_name":"Lalababy","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"105","brand_name":"吧吖吧吖","brand_class":"童装服饰","brand_pic":"","class_id":"1"},{"brand_id":"106","brand_name":"领先","brand_class":"","brand_pic":"","class_id":"0"},{"brand_id":"107","brand_name":"金洋创意","brand_class":"","brand_pic":"http://image.awu.cn/data/upload/shop/brand/05309867903906434_sm.jpg","class_id":"0"}]
     */

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
        private GoodsClassBean goods_class;
        /**
         * attr_id : 1
         * attr_name : 性别
         * type_id : 1
         * attr_value_arr : [{"attr_value_id":"1","attr_value_name":"男"},{"attr_value_id":"2","attr_value_name":"女"},{"attr_value_id":"40","attr_value_name":"男女"}]
         */

        private List<GoodsAttrBean> goods_attr;
        /**
         * brand_id : 3
         * brand_name : adidas
         * brand_class : 童装服饰
         * brand_pic : http://image.awu.cn/data/upload/shop/brand/05019495567736280_sm.png
         * class_id : 1
         */

        private List<BrandRelatedBean> brand_related;

        public GoodsClassBean getGoods_class() {
            return goods_class;
        }

        public void setGoods_class(GoodsClassBean goods_class) {
            this.goods_class = goods_class;
        }

        public List<GoodsAttrBean> getGoods_attr() {
            return goods_attr;
        }

        public void setGoods_attr(List<GoodsAttrBean> goods_attr) {
            this.goods_attr = goods_attr;
        }

        public List<BrandRelatedBean> getBrand_related() {
            return brand_related;
        }

        public void setBrand_related(List<BrandRelatedBean> brand_related) {
            this.brand_related = brand_related;
        }

        public static class GoodsClassBean {
            /**
             * gc_id : 1
             * gc_name : 童装服饰
             * type_id : 1
             * pic : http://image.awu.cn/data/upload/shop/common/category-pic-1.jpg
             * class2 : [{"gc_id":"68","gc_name":"婴幼儿","type_id":"1","pic":"","class3":[{"gc_id":"106","gc_name":"罩衣围嘴","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-106.jpg"},{"gc_id":"102","gc_name":"婴儿内衣","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-102.jpg"},{"gc_id":"69","gc_name":"爬爬服","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-69.jpg"},{"gc_id":"103","gc_name":"婴儿礼盒","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-103.jpg"},{"gc_id":"71","gc_name":"婴儿帽子","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-71.jpg"},{"gc_id":"105","gc_name":"手脚套","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-105.jpg"},{"gc_id":"104","gc_name":"睡袋","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-104.jpg"},{"gc_id":"112","gc_name":"床品","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-112.jpg"}]},{"gc_id":"82","gc_name":"亲子装","type_id":"1","pic":""},{"gc_id":"2","gc_name":"上装","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-2.jpg","class3":[{"gc_id":"7","gc_name":"T恤","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-7.jpg"},{"gc_id":"8","gc_name":"衬衫","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-8.jpg"},{"gc_id":"42","gc_name":"卫衣","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-42.jpg"},{"gc_id":"9","gc_name":"针织衫","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-9.jpg"},{"gc_id":"10","gc_name":"马甲","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-10.jpg"},{"gc_id":"76","gc_name":"夹克","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-76.jpg"},{"gc_id":"11","gc_name":"外套","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-11.jpg"},{"gc_id":"75","gc_name":"风衣","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-75.jpg"},{"gc_id":"111","gc_name":"西服","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-111.jpg"},{"gc_id":"12","gc_name":"羽绒服","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-12.jpg"},{"gc_id":"48","gc_name":"棉衣","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-48.jpg"},{"gc_id":"65","gc_name":"背心","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-65.jpg"},{"gc_id":"108","gc_name":"防晒服","type_id":"1","gc_parent_id":"2","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-108.jpg"}]},{"gc_id":"3","gc_name":"下装","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-3.jpg","class3":[{"gc_id":"16","gc_name":"休闲裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-16.jpg"},{"gc_id":"15","gc_name":"牛仔裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-15.jpg"},{"gc_id":"14","gc_name":"运动裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-14.jpg"},{"gc_id":"85","gc_name":"连体裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-85.jpg"},{"gc_id":"13","gc_name":"打底裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-13.jpg"},{"gc_id":"18","gc_name":"裙裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-18.jpg"},{"gc_id":"84","gc_name":"短裤","type_id":"1","gc_parent_id":"3","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-84.jpg"}]},{"gc_id":"81","gc_name":"裙装","type_id":"1","pic":"","class3":[{"gc_id":"86","gc_name":"半身裙","type_id":"1","gc_parent_id":"81","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-86.jpg"},{"gc_id":"87","gc_name":"连衣裙","type_id":"1","gc_parent_id":"81","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-87.jpg"},{"gc_id":"88","gc_name":"礼服裙","type_id":"1","gc_parent_id":"81","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-88.jpg"}]},{"gc_id":"38","gc_name":"套装","type_id":"1","pic":"","class3":[{"gc_id":"99","gc_name":"休闲套装","type_id":"1","gc_parent_id":"38","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-99.jpg"},{"gc_id":"90","gc_name":"运动套装","type_id":"1","gc_parent_id":"38","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-90.jpg"},{"gc_id":"91","gc_name":"礼服套装","type_id":"1","gc_parent_id":"38","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-91.jpg"},{"gc_id":"89","gc_name":"泳装","type_id":"1","gc_parent_id":"38","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-89.jpg"}]},{"gc_id":"83","gc_name":"家居服","type_id":"1","pic":"","class3":[{"gc_id":"92","gc_name":"睡衣","type_id":"1","gc_parent_id":"83","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-92.jpg"},{"gc_id":"93","gc_name":"内衣裤","type_id":"1","gc_parent_id":"83","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-93.jpg"}]},{"gc_id":"5","gc_name":"鞋靴","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-5.jpg","class3":[{"gc_id":"45","gc_name":"棉鞋/靴子","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-45.jpg"},{"gc_id":"95","gc_name":"毛毛虫","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-95.jpg"},{"gc_id":"22","gc_name":"运动鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-22.jpg"},{"gc_id":"96","gc_name":"帆布鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-96.jpg"},{"gc_id":"61","gc_name":"凉鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-61.jpg"},{"gc_id":"23","gc_name":"休闲鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-23.jpg"},{"gc_id":"53","gc_name":"皮鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-53.jpg"},{"gc_id":"24","gc_name":"学步鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-24.jpg"},{"gc_id":"110","gc_name":"户外鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-110.jpg"},{"gc_id":"109","gc_name":"家居鞋","type_id":"1","gc_parent_id":"5","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-109.jpg"}]},{"gc_id":"6","gc_name":"配饰","type_id":"1","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-6.jpg","class3":[{"gc_id":"114","gc_name":"妈咪包袋","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-114.jpg"},{"gc_id":"26","gc_name":"帽子","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-26.jpg"},{"gc_id":"57","gc_name":"头饰","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-57.jpg"},{"gc_id":"25","gc_name":"袜子","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-25.jpg"},{"gc_id":"115","gc_name":"斜挎包","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-115.jpg"},{"gc_id":"63","gc_name":"书包","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-63.jpg"},{"gc_id":"28","gc_name":"围巾","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-28.jpg"},{"gc_id":"29","gc_name":"手套","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-29.jpg"},{"gc_id":"98","gc_name":"其他","type_id":"1","gc_parent_id":"6","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-98.jpg"}]},{"gc_id":"116","gc_name":"玩具教辅","type_id":"1","pic":"","class3":[{"gc_id":"117","gc_name":"布书","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-117.jpg"},{"gc_id":"118","gc_name":"咬咬胶","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-118.jpg"},{"gc_id":"123","gc_name":"毛绒/安抚","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-123.jpg"},{"gc_id":"119","gc_name":"摇铃/床挂","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-119.jpg"},{"gc_id":"120","gc_name":"益智","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-120.jpg"},{"gc_id":"121","gc_name":"健身架","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-121.jpg"},{"gc_id":"122","gc_name":"爬行垫","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-122.jpg"},{"gc_id":"124","gc_name":"字帖","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-124.jpg"},{"gc_id":"125","gc_name":"笔袋文具","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-125.jpg"},{"gc_id":"126","gc_name":"玩具礼盒","type_id":"1","gc_parent_id":"116","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-126.jpg"}]},{"gc_id":"4","gc_name":"搭配","type_id":"1","pic":""}]
             */

            private List<Class1Bean> class1;

            public List<Class1Bean> getClass1() {
                return class1;
            }

            public void setClass1(List<Class1Bean> class1) {
                this.class1 = class1;
            }

            public static class Class1Bean {
                private String gc_id;
                private String gc_name;
                private String type_id;
                private String pic;
                /**
                 * gc_id : 68
                 * gc_name : 婴幼儿
                 * type_id : 1
                 * pic :
                 * class3 : [{"gc_id":"106","gc_name":"罩衣围嘴","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-106.jpg"},{"gc_id":"102","gc_name":"婴儿内衣","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-102.jpg"},{"gc_id":"69","gc_name":"爬爬服","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-69.jpg"},{"gc_id":"103","gc_name":"婴儿礼盒","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-103.jpg"},{"gc_id":"71","gc_name":"婴儿帽子","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-71.jpg"},{"gc_id":"105","gc_name":"手脚套","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-105.jpg"},{"gc_id":"104","gc_name":"睡袋","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-104.jpg"},{"gc_id":"112","gc_name":"床品","type_id":"1","gc_parent_id":"68","pic":"http://image.awu.cn/data/upload/shop/common/category-pic-112.jpg"}]
                 */

                private List<Class2Bean> class2;

                public String getGc_id() {
                    return gc_id;
                }

                public void setGc_id(String gc_id) {
                    this.gc_id = gc_id;
                }

                public String getGc_name() {
                    return gc_name;
                }

                public void setGc_name(String gc_name) {
                    this.gc_name = gc_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public List<Class2Bean> getClass2() {
                    return class2;
                }

                public void setClass2(List<Class2Bean> class2) {
                    this.class2 = class2;
                }

                public static class Class2Bean {
                    private String gc_id;
                    private String gc_name;
                    private String type_id;
                    private String pic;
                    /**
                     * gc_id : 106
                     * gc_name : 罩衣围嘴
                     * type_id : 1
                     * gc_parent_id : 68
                     * pic : http://image.awu.cn/data/upload/shop/common/category-pic-106.jpg
                     */

                    private List<Class3Bean> class3;

                    public String getGc_id() {
                        return gc_id;
                    }

                    public void setGc_id(String gc_id) {
                        this.gc_id = gc_id;
                    }

                    public String getGc_name() {
                        return gc_name;
                    }

                    public void setGc_name(String gc_name) {
                        this.gc_name = gc_name;
                    }

                    public String getType_id() {
                        return type_id;
                    }

                    public void setType_id(String type_id) {
                        this.type_id = type_id;
                    }

                    public String getPic() {
                        return pic;
                    }

                    public void setPic(String pic) {
                        this.pic = pic;
                    }

                    public List<Class3Bean> getClass3() {
                        return class3;
                    }

                    public void setClass3(List<Class3Bean> class3) {
                        this.class3 = class3;
                    }

                    public static class Class3Bean {
                        private String gc_id;
                        private String gc_name;
                        private String type_id;
                        private String gc_parent_id;
                        private String pic;

                        public String getGc_id() {
                            return gc_id;
                        }

                        public void setGc_id(String gc_id) {
                            this.gc_id = gc_id;
                        }

                        public String getGc_name() {
                            return gc_name;
                        }

                        public void setGc_name(String gc_name) {
                            this.gc_name = gc_name;
                        }

                        public String getType_id() {
                            return type_id;
                        }

                        public void setType_id(String type_id) {
                            this.type_id = type_id;
                        }

                        public String getGc_parent_id() {
                            return gc_parent_id;
                        }

                        public void setGc_parent_id(String gc_parent_id) {
                            this.gc_parent_id = gc_parent_id;
                        }

                        public String getPic() {
                            return pic;
                        }

                        public void setPic(String pic) {
                            this.pic = pic;
                        }
                    }
                }
            }
        }

        public static class GoodsAttrBean {
            private String attr_id;
            private String attr_name;
            private String type_id;
            /**
             * attr_value_id : 1
             * attr_value_name : 男
             */

            private List<AttrValueArrBean> attr_value_arr;

            public String getAttr_id() {
                return attr_id;
            }

            public void setAttr_id(String attr_id) {
                this.attr_id = attr_id;
            }

            public String getAttr_name() {
                return attr_name;
            }

            public void setAttr_name(String attr_name) {
                this.attr_name = attr_name;
            }

            public String getType_id() {
                return type_id;
            }

            public void setType_id(String type_id) {
                this.type_id = type_id;
            }

            public List<AttrValueArrBean> getAttr_value_arr() {
                return attr_value_arr;
            }

            public void setAttr_value_arr(List<AttrValueArrBean> attr_value_arr) {
                this.attr_value_arr = attr_value_arr;
            }

            public static class AttrValueArrBean {
                private String attr_value_id;
                private String attr_value_name;

                public String getAttr_value_id() {
                    return attr_value_id;
                }

                public void setAttr_value_id(String attr_value_id) {
                    this.attr_value_id = attr_value_id;
                }

                public String getAttr_value_name() {
                    return attr_value_name;
                }

                public void setAttr_value_name(String attr_value_name) {
                    this.attr_value_name = attr_value_name;
                }
            }
        }

        public static class BrandRelatedBean {
            private String brand_id;
            private String brand_name;
            private String brand_class;
            private String brand_pic;
            private String class_id;

            public String getBrand_id() {
                return brand_id;
            }

            public void setBrand_id(String brand_id) {
                this.brand_id = brand_id;
            }

            public String getBrand_name() {
                return brand_name;
            }

            public void setBrand_name(String brand_name) {
                this.brand_name = brand_name;
            }

            public String getBrand_class() {
                return brand_class;
            }

            public void setBrand_class(String brand_class) {
                this.brand_class = brand_class;
            }

            public String getBrand_pic() {
                return brand_pic;
            }

            public void setBrand_pic(String brand_pic) {
                this.brand_pic = brand_pic;
            }

            public String getClass_id() {
                return class_id;
            }

            public void setClass_id(String class_id) {
                this.class_id = class_id;
            }
        }
    }
}
