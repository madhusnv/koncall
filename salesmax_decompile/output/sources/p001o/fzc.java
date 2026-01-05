package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class fzc {

    /* renamed from: a */
    public static final List f24278a;

    static {
        mge mgeVar = new mge("^(us|eu|ap|sa|ca|me|af|il|mx)\\-\\w+\\-\\d+$");
        Map mapM32684k = isa.m32684k(vyh.m53620a("af-south-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("ap-east-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("ap-northeast-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("ap-northeast-2", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("ap-northeast-3", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("ap-south-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("ap-south-2", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("ap-southeast-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("ap-southeast-2", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("ap-southeast-3", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("ap-southeast-4", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("ap-southeast-5", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("aws-global", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("ca-central-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("ca-west-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("eu-central-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("eu-central-2", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("eu-north-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("eu-south-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("eu-south-2", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("eu-west-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("eu-west-2", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("eu-west-3", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("il-central-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("me-central-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("me-south-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("sa-east-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("us-east-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("us-east-2", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("us-west-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("us-west-2", new wyc(null, null, null, null, null, 31, null)));
        Boolean bool = Boolean.TRUE;
        vyc vycVar = new vyc("aws", mapM32684k, mgeVar, new wyc("aws", "amazonaws.com", "api.aws", bool, bool, "us-east-1"));
        vyc vycVar2 = new vyc("aws-cn", isa.m32684k(vyh.m53620a("aws-cn-global", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("cn-north-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("cn-northwest-1", new wyc(null, null, null, null, null, 31, null))), new mge("^cn\\-\\w+\\-\\d+$"), new wyc("aws-cn", "amazonaws.com.cn", "api.amazonwebservices.com.cn", bool, bool, "cn-northwest-1"));
        vyc vycVar3 = new vyc("aws-us-gov", isa.m32684k(vyh.m53620a("aws-us-gov-global", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("us-gov-east-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("us-gov-west-1", new wyc(null, null, null, null, null, 31, null))), new mge("^us\\-gov\\-\\w+\\-\\d+$"), new wyc("aws-us-gov", "amazonaws.com", "api.aws", bool, bool, "us-gov-west-1"));
        mge mgeVar2 = new mge("^us\\-iso\\-\\w+\\-\\d+$");
        Map mapM32684k2 = isa.m32684k(vyh.m53620a("aws-iso-global", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("us-iso-east-1", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("us-iso-west-1", new wyc(null, null, null, null, null, 31, null)));
        Boolean bool2 = Boolean.FALSE;
        f24278a = ch3.m21249n(vycVar, vycVar2, vycVar3, new vyc("aws-iso", mapM32684k2, mgeVar2, new wyc("aws-iso", "c2s.ic.gov", "c2s.ic.gov", bool, bool2, "us-iso-east-1")), new vyc("aws-iso-b", isa.m32684k(vyh.m53620a("aws-iso-b-global", new wyc(null, null, null, null, null, 31, null)), vyh.m53620a("us-isob-east-1", new wyc(null, null, null, null, null, 31, null))), new mge("^us\\-isob\\-\\w+\\-\\d+$"), new wyc("aws-iso-b", "sc2s.sgov.gov", "sc2s.sgov.gov", bool, bool2, "us-isob-east-1")), new vyc("aws-iso-e", hsa.m31056f(vyh.m53620a("eu-isoe-west-1", new wyc(null, null, null, null, null, 31, null))), new mge("^eu\\-isoe\\-\\w+\\-\\d+$"), new wyc("aws-iso-e", "cloud.adc-e.uk", "cloud.adc-e.uk", bool, bool2, "eu-isoe-west-1")), new vyc("aws-iso-f", isa.m32681h(), new mge("^us\\-isof\\-\\w+\\-\\d+$"), new wyc("aws-iso-f", "csp.hci.ic.gov", "csp.hci.ic.gov", bool, bool2, "us-isof-south-1")));
    }

    /* renamed from: a */
    public static final wyc m27819a(String str) {
        return mm7.m39357d(f24278a, str);
    }
}
