package p001o;

import android.content.Context;
import p001o.bhf;
import p001o.cd2;
import p001o.d9i;

/* loaded from: classes2.dex */
public final class f72 implements d9i {

    /* renamed from: b */
    public final qu5 f22848b;

    public f72(Context context) {
        this.f22848b = qu5.m45842c(context);
    }

    @Override // p001o.d9i
    /* renamed from: a */
    public mq3 mo22642a(d9i.EnumC12848b enumC12848b, int i) {
        qpb qpbVarA0 = qpb.a0();
        bhf.C12402b c12402b = new bhf.C12402b();
        c12402b.m19060x(nfh.m40526b(enumC12848b, i));
        qpbVarA0.mo45760N(c9i.f17564w, c12402b.m19052o());
        qpbVarA0.mo45760N(c9i.f17566y, e72.f21088a);
        cd2.C12638a c12638a = new cd2.C12638a();
        c12638a.m20911t(nfh.m40525a(enumC12848b, i));
        qpbVarA0.mo45760N(c9i.f17565x, c12638a.m20901h());
        qpbVarA0.mo45760N(c9i.f17567z, enumC12848b == d9i.EnumC12848b.IMAGE_CAPTURE ? xc8.f53499c : o52.f37781a);
        if (enumC12848b == d9i.EnumC12848b.PREVIEW) {
            qpbVarA0.mo45760N(qd8.f41690p, this.f22848b.m45847f());
        }
        qpbVarA0.mo45760N(qd8.f41685k, Integer.valueOf(this.f22848b.m45845d(true).getRotation()));
        if (enumC12848b == d9i.EnumC12848b.VIDEO_CAPTURE || enumC12848b == d9i.EnumC12848b.STREAM_SHARING) {
            qpbVarA0.mo45760N(c9i.f17559C, Boolean.TRUE);
        }
        return tec.m49792Y(qpbVarA0);
    }
}
