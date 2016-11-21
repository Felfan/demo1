package beans;

import java.util.List;

/**
 * Created by Yizhongli on 2016/11/8.
 */
public class GoodsInfoDatas {

    /**
     * statusCode : 200
     * statusMsg : 获取成功！
     * result : {"relation_goods_list":[{"goods_id":"122365","market_price":"359.00","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 80","goods_price":"239.00","goods_pic":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_240.jpg","goods_costprice":"150.00","return_price":"0.00","goods_spec":["梦幻粉","80"],"goods_storage":"0","goods_state":"0","spec_image":"http://image.awu.cn/data/upload/shop/common/default_goods_image_150.gif","spec_name":["颜色","尺寸"],"spec_value":[["粉绿","梦幻粉","贝壳卡"],["80","90","100","110","120"]],"goods_assemble":[{"goods_id":"122360","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 80","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","80"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122361","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 90","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","90"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122362","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 100","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","100"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122363","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 110","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","110"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122364","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 120","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","120"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122365","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 80","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","80"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122366","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 90","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","90"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122367","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 100","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","100"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122368","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 110","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","110"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122369","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 120","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","120"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122370","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 80","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","80"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"},{"goods_id":"122371","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 90","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","90"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"},{"goods_id":"122372","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 100","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","100"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"},{"goods_id":"122373","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 110","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","110"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"},{"goods_id":"122374","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 120","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","120"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"}]},{"goods_id":"126169","market_price":"159.00","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 黑色 73（两用裆）","goods_price":"89.00","goods_pic":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025590104103_240.jpg","goods_costprice":"68.00","return_price":"0.00","goods_spec":["黑色","73（两用裆）"],"goods_storage":"10","goods_state":"1","spec_image":"http://image.awu.cn/data/upload/shop/common/default_goods_image_150.gif","spec_name":["颜色","尺寸"],"spec_value":[["藏青","黑色"],["73（两用裆）","80（两用裆）","90（两用裆）","100（两用裆）"]],"goods_assemble":[{"goods_id":"126165","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 藏青 73（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["藏青","73（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025636704956_150.jpg"},{"goods_id":"126166","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 藏青 80（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["藏青","80（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025636704956_150.jpg"},{"goods_id":"126167","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 藏青 90（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["藏青","90（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025636704956_150.jpg"},{"goods_id":"126168","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 藏青 100（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["藏青","100（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025636704956_150.jpg"},{"goods_id":"126169","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 黑色 73（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["黑色","73（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025590104103_150.jpg"},{"goods_id":"126170","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 黑色 80（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["黑色","80（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025590104103_150.jpg"},{"goods_id":"126171","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 黑色 90（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["黑色","90（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025590104103_150.jpg"},{"goods_id":"126172","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 黑色 100（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["黑色","100（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025590104103_150.jpg"}]},{"goods_id":"126312","market_price":"279.00","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 深粉 80","goods_price":"149.00","goods_pic":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102521717250_240.jpg","goods_costprice":"117.00","return_price":"0.00","goods_spec":["深粉","80"],"goods_storage":"10","goods_state":"1","spec_image":"http://image.awu.cn/data/upload/shop/common/default_goods_image_150.gif","spec_name":["颜色","尺寸"],"spec_value":[["藏青","浅花灰","深粉"],["80","90","100","110","120"]],"goods_assemble":[{"goods_id":"126302","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 藏青 80","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["藏青","80"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102483702128_150.jpg"},{"goods_id":"126303","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 藏青 90","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["藏青","90"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102483702128_150.jpg"},{"goods_id":"126304","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 藏青 100","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["藏青","100"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102483702128_150.jpg"},{"goods_id":"126305","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 藏青 110","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["藏青","110"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102483702128_150.jpg"},{"goods_id":"126306","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 藏青 120","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["藏青","120"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102483702128_150.jpg"},{"goods_id":"126307","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 浅花灰 80","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["浅花灰","80"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102502999900_150.jpg"},{"goods_id":"126308","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 浅花灰 90","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["浅花灰","90"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102502999900_150.jpg"},{"goods_id":"126309","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 浅花灰 100","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["浅花灰","100"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102502999900_150.jpg"},{"goods_id":"126310","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 浅花灰 110","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["浅花灰","110"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102502999900_150.jpg"},{"goods_id":"126311","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 浅花灰 120","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["浅花灰","120"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102502999900_150.jpg"},{"goods_id":"126312","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 深粉 80","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["深粉","80"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102521717250_150.jpg"},{"goods_id":"126313","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 深粉 90","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["深粉","90"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102521717250_150.jpg"},{"goods_id":"126314","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 深粉 100","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["深粉","100"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102521717250_150.jpg"},{"goods_id":"126315","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 深粉 110","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["深粉","110"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102521717250_150.jpg"},{"goods_id":"126316","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 深粉 120","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["深粉","120"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102521717250_150.jpg"}]},{"goods_id":"78056","market_price":"198.00","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 粉色 21","goods_price":"79.00","goods_pic":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513174066272_240.jpg","goods_costprice":"59.00","return_price":"0.00","goods_spec":["粉色","21"],"goods_storage":"23","goods_state":"1","spec_image":"http://image.awu.cn/data/upload/shop/common/default_goods_image_150.gif","spec_name":["颜色","尺寸"],"spec_value":[["黑色","粉色"],["21","22","23","24","25"]],"goods_assemble":[{"goods_id":"78051","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 黑色 21","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["黑色","21"],"goods_storage":"22","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513185784848_150.jpg"},{"goods_id":"78052","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 黑色 22","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["黑色","22"],"goods_storage":"24","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513185784848_150.jpg"},{"goods_id":"78053","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 黑色 23","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["黑色","23"],"goods_storage":"34","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513185784848_150.jpg"},{"goods_id":"78054","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 黑色 24","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["黑色","24"],"goods_storage":"50","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513185784848_150.jpg"},{"goods_id":"78055","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 黑色 25","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["黑色","25"],"goods_storage":"69","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513185784848_150.jpg"},{"goods_id":"78056","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 粉色 21","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["粉色","21"],"goods_storage":"23","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513174066272_150.jpg"},{"goods_id":"78057","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 粉色 22","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["粉色","22"],"goods_storage":"26","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513174066272_150.jpg"},{"goods_id":"78058","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 粉色 23","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["粉色","23"],"goods_storage":"15","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513174066272_150.jpg"},{"goods_id":"78059","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 粉色 24","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["粉色","24"],"goods_storage":"53","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513174066272_150.jpg"},{"goods_id":"78060","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 粉色 25","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["粉色","25"],"goods_storage":"70","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513174066272_150.jpg"}]}],"goods_info":{"goods_commonid":"10713","goods_name":"秋游聚会萌趣兔耳女童套装","goods_recommend_reason":"","gc_id":"4","gc_name":"童装服饰 &gt;搭配","store_id":"1","store_name":"啊屋","brand_id":"0","brand_name":"啊屋品牌","goods_body":"<img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930065483710_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930016071937_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930020464323_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930047699058_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315929995393723_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930072535254_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930050600778_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930031520353_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930068827783_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930086376179_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930043508573_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930075100968_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930572382386_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930570130535_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930575003496_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930581164705_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930568454159_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930576907297_1280.jpg\" alt=\"image\" />","goods_price":"556.00","goods_marketprice":"995.00","goods_costprice":"394.00","return_price":"0.00","goods_freight":"10.00","goods_guide":"","goods_state":"1","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315929892674126_750.jpg","goods_collect":"0","is_collected":0,"goods_image_mobile":["http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931281795206_750.jpg","http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931347976617_750.jpg","http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931296754111_750.jpg","http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931310286460_750.jpg","http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931331295827_750.jpg"]}}
     * sign : xgecb/973qC2madIH1Dv0LUc76BjovlEoABRtMX+hG0ygk0HC46vFMZkGxyI4lxduwSQJMu3xbeUxUR0VTjk0BcJl+Q3dL8jBW47EZWL1fu+Q11KoH2U54OY4kIbKnBiAI391SUb1mfAbiRePqa8rkxMm3fXr8hp18oGH8m+Hig=
     * timestamp : 1478593700
     */

    private int statusCode;
    private String statusMsg;
    /**
     * relation_goods_list : [{"goods_id":"122365","market_price":"359.00","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 80","goods_price":"239.00","goods_pic":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_240.jpg","goods_costprice":"150.00","return_price":"0.00","goods_spec":["梦幻粉","80"],"goods_storage":"0","goods_state":"0","spec_image":"http://image.awu.cn/data/upload/shop/common/default_goods_image_150.gif","spec_name":["颜色","尺寸"],"spec_value":[["粉绿","梦幻粉","贝壳卡"],["80","90","100","110","120"]],"goods_assemble":[{"goods_id":"122360","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 80","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","80"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122361","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 90","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","90"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122362","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 100","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","100"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122363","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 110","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","110"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122364","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 120","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","120"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122365","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 80","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","80"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122366","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 90","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","90"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122367","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 100","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","100"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122368","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 110","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","110"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122369","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 120","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","120"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122370","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 80","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","80"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"},{"goods_id":"122371","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 90","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","90"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"},{"goods_id":"122372","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 100","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","100"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"},{"goods_id":"122373","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 110","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","110"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"},{"goods_id":"122374","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 120","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","120"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"}]},{"goods_id":"126169","market_price":"159.00","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 黑色 73（两用裆）","goods_price":"89.00","goods_pic":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025590104103_240.jpg","goods_costprice":"68.00","return_price":"0.00","goods_spec":["黑色","73（两用裆）"],"goods_storage":"10","goods_state":"1","spec_image":"http://image.awu.cn/data/upload/shop/common/default_goods_image_150.gif","spec_name":["颜色","尺寸"],"spec_value":[["藏青","黑色"],["73（两用裆）","80（两用裆）","90（两用裆）","100（两用裆）"]],"goods_assemble":[{"goods_id":"126165","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 藏青 73（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["藏青","73（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025636704956_150.jpg"},{"goods_id":"126166","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 藏青 80（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["藏青","80（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025636704956_150.jpg"},{"goods_id":"126167","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 藏青 90（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["藏青","90（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025636704956_150.jpg"},{"goods_id":"126168","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 藏青 100（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["藏青","100（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025636704956_150.jpg"},{"goods_id":"126169","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 黑色 73（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["黑色","73（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025590104103_150.jpg"},{"goods_id":"126170","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 黑色 80（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["黑色","80（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025590104103_150.jpg"},{"goods_id":"126171","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 黑色 90（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["黑色","90（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025590104103_150.jpg"},{"goods_id":"126172","goods_name":"迷你巴拉巴拉 16秋冬新品加绒开档 打底裤 黑色 100（两用裆）","goods_price":"89.00","goods_marketprice":"159.00","goods_costprice":"68.00","goods_spec":["黑色","100（两用裆）"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314025590104103_150.jpg"}]},{"goods_id":"126312","market_price":"279.00","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 深粉 80","goods_price":"149.00","goods_pic":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102521717250_240.jpg","goods_costprice":"117.00","return_price":"0.00","goods_spec":["深粉","80"],"goods_storage":"10","goods_state":"1","spec_image":"http://image.awu.cn/data/upload/shop/common/default_goods_image_150.gif","spec_name":["颜色","尺寸"],"spec_value":[["藏青","浅花灰","深粉"],["80","90","100","110","120"]],"goods_assemble":[{"goods_id":"126302","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 藏青 80","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["藏青","80"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102483702128_150.jpg"},{"goods_id":"126303","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 藏青 90","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["藏青","90"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102483702128_150.jpg"},{"goods_id":"126304","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 藏青 100","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["藏青","100"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102483702128_150.jpg"},{"goods_id":"126305","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 藏青 110","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["藏青","110"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102483702128_150.jpg"},{"goods_id":"126306","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 藏青 120","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["藏青","120"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102483702128_150.jpg"},{"goods_id":"126307","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 浅花灰 80","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["浅花灰","80"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102502999900_150.jpg"},{"goods_id":"126308","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 浅花灰 90","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["浅花灰","90"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102502999900_150.jpg"},{"goods_id":"126309","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 浅花灰 100","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["浅花灰","100"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102502999900_150.jpg"},{"goods_id":"126310","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 浅花灰 110","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["浅花灰","110"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102502999900_150.jpg"},{"goods_id":"126311","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 浅花灰 120","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["浅花灰","120"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102502999900_150.jpg"},{"goods_id":"126312","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 深粉 80","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["深粉","80"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102521717250_150.jpg"},{"goods_id":"126313","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 深粉 90","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["深粉","90"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102521717250_150.jpg"},{"goods_id":"126314","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 深粉 100","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["深粉","100"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102521717250_150.jpg"},{"goods_id":"126315","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 深粉 110","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["深粉","110"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102521717250_150.jpg"},{"goods_id":"126316","goods_name":"迷你巴拉巴拉 16秋冬新品韩版长袖娃娃领 连衣裙 深粉 120","goods_price":"149.00","goods_marketprice":"279.00","goods_costprice":"117.00","goods_spec":["深粉","120"],"goods_storage":"10","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/57/57_05314102521717250_150.jpg"}]},{"goods_id":"78056","market_price":"198.00","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 粉色 21","goods_price":"79.00","goods_pic":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513174066272_240.jpg","goods_costprice":"59.00","return_price":"0.00","goods_spec":["粉色","21"],"goods_storage":"23","goods_state":"1","spec_image":"http://image.awu.cn/data/upload/shop/common/default_goods_image_150.gif","spec_name":["颜色","尺寸"],"spec_value":[["黑色","粉色"],["21","22","23","24","25"]],"goods_assemble":[{"goods_id":"78051","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 黑色 21","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["黑色","21"],"goods_storage":"22","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513185784848_150.jpg"},{"goods_id":"78052","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 黑色 22","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["黑色","22"],"goods_storage":"24","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513185784848_150.jpg"},{"goods_id":"78053","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 黑色 23","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["黑色","23"],"goods_storage":"34","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513185784848_150.jpg"},{"goods_id":"78054","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 黑色 24","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["黑色","24"],"goods_storage":"50","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513185784848_150.jpg"},{"goods_id":"78055","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 黑色 25","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["黑色","25"],"goods_storage":"69","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513185784848_150.jpg"},{"goods_id":"78056","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 粉色 21","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["粉色","21"],"goods_storage":"23","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513174066272_150.jpg"},{"goods_id":"78057","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 粉色 22","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["粉色","22"],"goods_storage":"26","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513174066272_150.jpg"},{"goods_id":"78058","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 粉色 23","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["粉色","23"],"goods_storage":"15","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513174066272_150.jpg"},{"goods_id":"78059","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 粉色 24","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["粉色","24"],"goods_storage":"53","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513174066272_150.jpg"},{"goods_id":"78060","goods_name":"斯纳菲 女童 粉色 黑色 16秋新品防滑公主鞋真皮皮鞋 粉色 25","goods_price":"79.00","goods_marketprice":"198.00","goods_costprice":"59.00","goods_spec":["粉色","25"],"goods_storage":"70","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/48/48_05228513174066272_150.jpg"}]}]
     * goods_info : {"goods_commonid":"10713","goods_name":"秋游聚会萌趣兔耳女童套装","goods_recommend_reason":"","gc_id":"4","gc_name":"童装服饰 &gt;搭配","store_id":"1","store_name":"啊屋","brand_id":"0","brand_name":"啊屋品牌","goods_body":"<img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930065483710_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930016071937_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930020464323_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930047699058_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315929995393723_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930072535254_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930050600778_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930031520353_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930068827783_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930086376179_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930043508573_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930075100968_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930572382386_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930570130535_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930575003496_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930581164705_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930568454159_1280.jpg\" alt=\"image\" /><img src=\"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930576907297_1280.jpg\" alt=\"image\" />","goods_price":"556.00","goods_marketprice":"995.00","goods_costprice":"394.00","return_price":"0.00","goods_freight":"10.00","goods_guide":"","goods_state":"1","goods_image":"http://image.awu.cn/data/upload/shop/store/goods/1/1_05315929892674126_750.jpg","goods_collect":"0","is_collected":0,"goods_image_mobile":["http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931281795206_750.jpg","http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931347976617_750.jpg","http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931296754111_750.jpg","http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931310286460_750.jpg","http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931331295827_750.jpg"]}
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
        /**
         * goods_commonid : 10713
         * goods_name : 秋游聚会萌趣兔耳女童套装
         * goods_recommend_reason :
         * gc_id : 4
         * gc_name : 童装服饰 &gt;搭配
         * store_id : 1
         * store_name : 啊屋
         * brand_id : 0
         * brand_name : 啊屋品牌
         * goods_body : <img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930065483710_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930016071937_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930020464323_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930047699058_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315929995393723_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930072535254_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930050600778_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930031520353_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930068827783_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930086376179_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930043508573_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930075100968_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930572382386_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930570130535_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930575003496_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930581164705_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930568454159_1280.jpg" alt="image" /><img src="http://image.awu.cn/data/upload/shop/store/goods/1/1_05315930576907297_1280.jpg" alt="image" />
         * goods_price : 556.00
         * goods_marketprice : 995.00
         * goods_costprice : 394.00
         * return_price : 0.00
         * goods_freight : 10.00
         * goods_guide :
         * goods_state : 1
         * goods_image : http://image.awu.cn/data/upload/shop/store/goods/1/1_05315929892674126_750.jpg
         * goods_collect : 0
         * is_collected : 0
         * goods_image_mobile : ["http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931281795206_750.jpg","http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931347976617_750.jpg","http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931296754111_750.jpg","http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931310286460_750.jpg","http://image.awu.cn/data/upload/shop/store/goods/1/1_05315931331295827_750.jpg"]
         */

        private GoodsInfoBean goods_info;
        /**
         * goods_id : 122365
         * market_price : 359.00
         * goods_name : Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 80
         * goods_price : 239.00
         * goods_pic : http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_240.jpg
         * goods_costprice : 150.00
         * return_price : 0.00
         * goods_spec : ["梦幻粉","80"]
         * goods_storage : 0
         * goods_state : 0
         * spec_image : http://image.awu.cn/data/upload/shop/common/default_goods_image_150.gif
         * spec_name : ["颜色","尺寸"]
         * spec_value : [["粉绿","梦幻粉","贝壳卡"],["80","90","100","110","120"]]
         * goods_assemble : [{"goods_id":"122360","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 80","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","80"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122361","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 90","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","90"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122362","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 100","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","100"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122363","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 110","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","110"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122364","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 120","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["粉绿","120"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg"},{"goods_id":"122365","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 80","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","80"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122366","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 90","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","90"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122367","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 100","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","100"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122368","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 110","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","110"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122369","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 梦幻粉 120","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["梦幻粉","120"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194175787912_150.jpg"},{"goods_id":"122370","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 80","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","80"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"},{"goods_id":"122371","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 90","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","90"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"},{"goods_id":"122372","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 100","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","100"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"},{"goods_id":"122373","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 110","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","110"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"},{"goods_id":"122374","goods_name":"Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 贝壳卡 120","goods_price":"239.00","goods_marketprice":"359.00","goods_costprice":"150.00","goods_spec":["贝壳卡","120"],"goods_storage":"0","return_price":"0.00","spec_image":"http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194199129502_150.jpg"}]
         */

        private List<RelationGoodsListBean> relation_goods_list;

        public GoodsInfoBean getGoods_info() {
            return goods_info;
        }

        public void setGoods_info(GoodsInfoBean goods_info) {
            this.goods_info = goods_info;
        }

        public List<RelationGoodsListBean> getRelation_goods_list() {
            return relation_goods_list;
        }

        public void setRelation_goods_list(List<RelationGoodsListBean> relation_goods_list) {
            this.relation_goods_list = relation_goods_list;
        }

        public static class GoodsInfoBean {
            private String goods_commonid;
            private String goods_name;
            private String goods_recommend_reason;
            private String gc_id;
            private String gc_name;
            private String store_id;
            private String store_name;
            private String brand_id;
            private String brand_name;
            private String goods_body;
            private String goods_price;
            private String goods_marketprice;
            private String goods_costprice;
            private String return_price;
            private String goods_freight;
            private String goods_guide;
            private String goods_state;
            private String goods_image;
            private String goods_collect;
            private int is_collected;
            private List<String> goods_image_mobile;

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

            public String getGoods_recommend_reason() {
                return goods_recommend_reason;
            }

            public void setGoods_recommend_reason(String goods_recommend_reason) {
                this.goods_recommend_reason = goods_recommend_reason;
            }

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

            public String getStore_id() {
                return store_id;
            }

            public void setStore_id(String store_id) {
                this.store_id = store_id;
            }

            public String getStore_name() {
                return store_name;
            }

            public void setStore_name(String store_name) {
                this.store_name = store_name;
            }

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

            public String getGoods_body() {
                return goods_body;
            }

            public void setGoods_body(String goods_body) {
                this.goods_body = goods_body;
            }

            public String getGoods_price() {
                return goods_price;
            }

            public void setGoods_price(String goods_price) {
                this.goods_price = goods_price;
            }

            public String getGoods_marketprice() {
                return goods_marketprice;
            }

            public void setGoods_marketprice(String goods_marketprice) {
                this.goods_marketprice = goods_marketprice;
            }

            public String getGoods_costprice() {
                return goods_costprice;
            }

            public void setGoods_costprice(String goods_costprice) {
                this.goods_costprice = goods_costprice;
            }

            public String getReturn_price() {
                return return_price;
            }

            public void setReturn_price(String return_price) {
                this.return_price = return_price;
            }

            public String getGoods_freight() {
                return goods_freight;
            }

            public void setGoods_freight(String goods_freight) {
                this.goods_freight = goods_freight;
            }

            public String getGoods_guide() {
                return goods_guide;
            }

            public void setGoods_guide(String goods_guide) {
                this.goods_guide = goods_guide;
            }

            public String getGoods_state() {
                return goods_state;
            }

            public void setGoods_state(String goods_state) {
                this.goods_state = goods_state;
            }

            public String getGoods_image() {
                return goods_image;
            }

            public void setGoods_image(String goods_image) {
                this.goods_image = goods_image;
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

            public List<String> getGoods_image_mobile() {
                return goods_image_mobile;
            }

            public void setGoods_image_mobile(List<String> goods_image_mobile) {
                this.goods_image_mobile = goods_image_mobile;
            }
        }

        public static class RelationGoodsListBean {
            private String goods_id;
            private String market_price;
            private String goods_name;
            private String goods_price;
            private String goods_pic;
            private String goods_costprice;
            private String return_price;
            private String goods_storage;
            private String goods_state;
            private String spec_image;
            private List<String> goods_spec;
            private List<String> spec_name;
            private List<List<String>> spec_value;
            /**
             * goods_id : 122360
             * goods_name : Balabala 巴拉巴拉 16秋冬新品儿童加厚 棉服 粉绿 80
             * goods_price : 239.00
             * goods_marketprice : 359.00
             * goods_costprice : 150.00
             * goods_spec : ["粉绿","80"]
             * goods_storage : 0
             * return_price : 0.00
             * spec_image : http://image.awu.cn/data/upload/shop/store/goods/3/3_05307194155128005_150.jpg
             */

            private List<GoodsAssembleBean> goods_assemble;

            public String getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(String goods_id) {
                this.goods_id = goods_id;
            }

            public String getMarket_price() {
                return market_price;
            }

            public void setMarket_price(String market_price) {
                this.market_price = market_price;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public String getGoods_price() {
                return goods_price;
            }

            public void setGoods_price(String goods_price) {
                this.goods_price = goods_price;
            }

            public String getGoods_pic() {
                return goods_pic;
            }

            public void setGoods_pic(String goods_pic) {
                this.goods_pic = goods_pic;
            }

            public String getGoods_costprice() {
                return goods_costprice;
            }

            public void setGoods_costprice(String goods_costprice) {
                this.goods_costprice = goods_costprice;
            }

            public String getReturn_price() {
                return return_price;
            }

            public void setReturn_price(String return_price) {
                this.return_price = return_price;
            }

            public String getGoods_storage() {
                return goods_storage;
            }

            public void setGoods_storage(String goods_storage) {
                this.goods_storage = goods_storage;
            }

            public String getGoods_state() {
                return goods_state;
            }

            public void setGoods_state(String goods_state) {
                this.goods_state = goods_state;
            }

            public String getSpec_image() {
                return spec_image;
            }

            public void setSpec_image(String spec_image) {
                this.spec_image = spec_image;
            }

            public List<String> getGoods_spec() {
                return goods_spec;
            }

            public void setGoods_spec(List<String> goods_spec) {
                this.goods_spec = goods_spec;
            }

            public List<String> getSpec_name() {
                return spec_name;
            }

            public void setSpec_name(List<String> spec_name) {
                this.spec_name = spec_name;
            }

            public List<List<String>> getSpec_value() {
                return spec_value;
            }

            public void setSpec_value(List<List<String>> spec_value) {
                this.spec_value = spec_value;
            }

            public List<GoodsAssembleBean> getGoods_assemble() {
                return goods_assemble;
            }

            public void setGoods_assemble(List<GoodsAssembleBean> goods_assemble) {
                this.goods_assemble = goods_assemble;
            }

            public static class GoodsAssembleBean {
                private String goods_id;
                private String goods_name;
                private String goods_price;
                private String goods_marketprice;
                private String goods_costprice;
                private String goods_storage;
                private String return_price;
                private String spec_image;
                private List<String> goods_spec;

                public String getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(String goods_id) {
                    this.goods_id = goods_id;
                }

                public String getGoods_name() {
                    return goods_name;
                }

                public void setGoods_name(String goods_name) {
                    this.goods_name = goods_name;
                }

                public String getGoods_price() {
                    return goods_price;
                }

                public void setGoods_price(String goods_price) {
                    this.goods_price = goods_price;
                }

                public String getGoods_marketprice() {
                    return goods_marketprice;
                }

                public void setGoods_marketprice(String goods_marketprice) {
                    this.goods_marketprice = goods_marketprice;
                }

                public String getGoods_costprice() {
                    return goods_costprice;
                }

                public void setGoods_costprice(String goods_costprice) {
                    this.goods_costprice = goods_costprice;
                }

                public String getGoods_storage() {
                    return goods_storage;
                }

                public void setGoods_storage(String goods_storage) {
                    this.goods_storage = goods_storage;
                }

                public String getReturn_price() {
                    return return_price;
                }

                public void setReturn_price(String return_price) {
                    this.return_price = return_price;
                }

                public String getSpec_image() {
                    return spec_image;
                }

                public void setSpec_image(String spec_image) {
                    this.spec_image = spec_image;
                }

                public List<String> getGoods_spec() {
                    return goods_spec;
                }

                public void setGoods_spec(List<String> goods_spec) {
                    this.goods_spec = goods_spec;
                }
            }
        }
    }
}
