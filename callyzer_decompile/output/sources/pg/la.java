package pg;

import android.content.Context;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import jj.InterfaceC3778c;
import l4.C4367l;
import og.vf;
import og.zg;
import qi.C6230m;
import tb.C7105p;
import ue.C7419a;
import ue.C7421c;
import ue.EnumC7422d;
import ve.C7707a;
import w3.C7892j;
import xe.C8363o;
import xe.C8364p;
import xe.C8365q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class la implements ia {

    /* renamed from: a */
    public final C6230m f28959a;

    /* renamed from: b */
    public final ha f28960b;

    public la(Context context, ha haVar) {
        this.f28960b = haVar;
        C7707a c7707a = C7707a.f37227e;
        C8365q.m15537b(context);
        C8363o c8363oM15538c = C8365q.m15536a().m15538c(c7707a);
        if (C7707a.f37226d.contains(new C7421c("json"))) {
            new C6230m(new zg(c8363oM15538c, 2));
        }
        this.f28959a = new C6230m(new zg(c8363oM15538c, 3));
    }

    @Override // pg.ia
    /* renamed from: a */
    public final void mo11701a(C7105p c7105p) {
        C5925f c5925f;
        InterfaceC3778c interfaceC3778c;
        C8364p c8364p = (C8364p) this.f28959a.get();
        oa oaVar = oa.f29013c;
        C4367l c4367l = (C4367l) c7105p.f34290b;
        ((vf) c7105p.f34291c).f26873h = false;
        vf vfVar = (vf) c7105p.f34291c;
        vfVar.f26871f = Boolean.FALSE;
        c4367l.f21921b = new m9(vfVar);
        try {
            oa.m11812b();
            l7 l7Var = new l7(c4367l);
            C4367l c4367l2 = new C4367l(19);
            oaVar.m11813a(c4367l2);
            HashMap map = new HashMap((HashMap) c4367l2.f21921b);
            HashMap map2 = new HashMap((HashMap) c4367l2.f21922c);
            C5924e c5924e = (C5924e) c4367l2.f21923d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                c5925f = new C5925f(byteArrayOutputStream, map, map2, c5924e);
                interfaceC3778c = (InterfaceC3778c) map.get(l7.class);
            } catch (IOException unused) {
            }
            if (interfaceC3778c == null) {
                throw new EncodingException("No encoder for ".concat(String.valueOf(l7.class)));
            }
            interfaceC3778c.mo5788a(l7Var, c5925f);
            c8364p.m15535a(new C7419a(byteArrayOutputStream.toByteArray(), EnumC7422d.VERY_LOW, null), new C7892j(12));
        } catch (UnsupportedEncodingException e2) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e2);
        }
    }
}
