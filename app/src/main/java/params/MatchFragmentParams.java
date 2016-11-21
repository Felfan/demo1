package params;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

/**
 * Created by Yizhongli on 2016/11/7.
 */
@HttpRequest(host = "http://console.awu.cn",path = "api/index.php")
public class MatchFragmentParams extends RequestParams {
    public String act="special";
    public String op="special";
}
