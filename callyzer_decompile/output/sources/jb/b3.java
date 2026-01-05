package jb;

import j0.AbstractC3504d;
import java.util.List;
import java.util.Map;
import ma.C4683b;
import ma.C4684c;
import nx.C5176n;
import og.pe;
import qw.C6361k;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b3 {

    /* renamed from: a */
    public static final List f19450a;

    static {
        C5176n c5176n = new C5176n("^(us|eu|ap|sa|ca|me|af|il|mx)\\-\\w+\\-\\d+$");
        Map mapM12778f = AbstractC6674x.m12778f(new C6361k("af-south-1", new C4684c()), new C6361k("ap-east-1", new C4684c()), new C6361k("ap-east-2", new C4684c()), new C6361k("ap-northeast-1", new C4684c()), new C6361k("ap-northeast-2", new C4684c()), new C6361k("ap-northeast-3", new C4684c()), new C6361k("ap-south-1", new C4684c()), new C6361k("ap-south-2", new C4684c()), new C6361k("ap-southeast-1", new C4684c()), new C6361k("ap-southeast-2", new C4684c()), new C6361k("ap-southeast-3", new C4684c()), new C6361k("ap-southeast-4", new C4684c()), new C6361k("ap-southeast-5", new C4684c()), new C6361k("ap-southeast-7", new C4684c()), new C6361k("aws-global", new C4684c()), new C6361k("ca-central-1", new C4684c()), new C6361k("ca-west-1", new C4684c()), new C6361k("eu-central-1", new C4684c()), new C6361k("eu-central-2", new C4684c()), new C6361k("eu-north-1", new C4684c()), new C6361k("eu-south-1", new C4684c()), new C6361k("eu-south-2", new C4684c()), new C6361k("eu-west-1", new C4684c()), new C6361k("eu-west-2", new C4684c()), new C6361k("eu-west-3", new C4684c()), new C6361k("il-central-1", new C4684c()), new C6361k("me-central-1", new C4684c()), new C6361k("me-south-1", new C4684c()), new C6361k("mx-central-1", new C4684c()), new C6361k("sa-east-1", new C4684c()), new C6361k("us-east-1", new C4684c()), new C6361k("us-east-2", new C4684c()), new C6361k("us-west-1", new C4684c()), new C6361k("us-west-2", new C4684c()));
        Boolean bool = Boolean.TRUE;
        C4683b c4683b = new C4683b("aws", mapM12778f, c5176n, new C4684c("aws", "amazonaws.com", "api.aws", bool, bool, "us-east-1"));
        C4683b c4683b2 = new C4683b("aws-cn", AbstractC6674x.m12778f(new C6361k("aws-cn-global", new C4684c()), new C6361k("cn-north-1", new C4684c()), new C6361k("cn-northwest-1", new C4684c())), new C5176n("^cn\\-\\w+\\-\\d+$"), new C4684c("aws-cn", "amazonaws.com.cn", "api.amazonwebservices.com.cn", bool, bool, "cn-northwest-1"));
        C4683b c4683b3 = new C4683b("aws-us-gov", AbstractC6674x.m12778f(new C6361k("aws-us-gov-global", new C4684c()), new C6361k("us-gov-east-1", new C4684c()), new C6361k("us-gov-west-1", new C4684c())), new C5176n("^us\\-gov\\-\\w+\\-\\d+$"), new C4684c("aws-us-gov", "amazonaws.com", "api.aws", bool, bool, "us-gov-west-1"));
        C5176n c5176n2 = new C5176n("^us\\-iso\\-\\w+\\-\\d+$");
        Map mapM12778f2 = AbstractC6674x.m12778f(new C6361k("aws-iso-global", new C4684c()), new C6361k("us-iso-east-1", new C4684c()), new C6361k("us-iso-west-1", new C4684c()));
        Boolean bool2 = Boolean.FALSE;
        f19450a = pe.m10834i(c4683b, c4683b2, c4683b3, new C4683b("aws-iso", mapM12778f2, c5176n2, new C4684c("aws-iso", "c2s.ic.gov", "c2s.ic.gov", bool, bool2, "us-iso-east-1")), new C4683b("aws-iso-b", AbstractC6674x.m12778f(new C6361k("aws-iso-b-global", new C4684c()), new C6361k("us-isob-east-1", new C4684c())), new C5176n("^us\\-isob\\-\\w+\\-\\d+$"), new C4684c("aws-iso-b", "sc2s.sgov.gov", "sc2s.sgov.gov", bool, bool2, "us-isob-east-1")), new C4683b("aws-iso-e", AbstractC6674x.m12778f(new C6361k("aws-iso-e-global", new C4684c()), new C6361k("eu-isoe-west-1", new C4684c())), new C5176n("^eu\\-isoe\\-\\w+\\-\\d+$"), new C4684c("aws-iso-e", "cloud.adc-e.uk", "cloud.adc-e.uk", bool, bool2, "eu-isoe-west-1")), new C4683b("aws-iso-f", AbstractC6674x.m12778f(new C6361k("aws-iso-f-global", new C4684c()), new C6361k("us-isof-east-1", new C4684c()), new C6361k("us-isof-south-1", new C4684c())), new C5176n("^us\\-isof\\-\\w+\\-\\d+$"), new C4684c("aws-iso-f", "csp.hci.ic.gov", "csp.hci.ic.gov", bool, bool2, "us-isof-south-1")), new C4683b("aws-eusc", AbstractC6674x.m12777e(new C6361k("eusc-de-east-1", new C4684c())), new C5176n("^eusc\\-(de)\\-\\w+\\-\\d+$"), new C4684c("aws-eusc", "amazonaws.eu", "amazonaws.eu", bool, bool2, "eusc-de-east-1")));
    }

    /* renamed from: a */
    public static final C4684c m8271a(String str) {
        return AbstractC3504d.m8064i(str, f19450a);
    }
}
