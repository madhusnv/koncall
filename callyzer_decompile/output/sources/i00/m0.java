package i00;

import a1.C0005d;
import a9.C0073l;
import c9.C0917l;
import com.amplifyframework.storage.ObjectMetadata;
import eb.i3;
import iz.C3389v;
import iz.C3390w;
import iz.C3391x;
import iz.C3393z;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4154l;
import nx.C5176n;
import pg.h7;
import yz.AbstractC8831a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: l */
    public static final char[] f16674l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f16675m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f16676a;

    /* renamed from: b */
    public final C3391x f16677b;

    /* renamed from: c */
    public String f16678c;

    /* renamed from: d */
    public C3390w f16679d;

    /* renamed from: e */
    public final C0073l f16680e = new C0073l();

    /* renamed from: f */
    public final i3 f16681f;

    /* renamed from: g */
    public C3393z f16682g;

    /* renamed from: h */
    public final boolean f16683h;

    /* renamed from: i */
    public final C0005d f16684i;

    /* renamed from: j */
    public final C0917l f16685j;

    /* renamed from: k */
    public iz.i0 f16686k;

    public m0(String str, C3391x c3391x, String str2, C3389v c3389v, C3393z c3393z, boolean z6, boolean z10, boolean z11) {
        this.f16676a = str;
        this.f16677b = c3391x;
        this.f16678c = str2;
        this.f16682g = c3393z;
        this.f16683h = z6;
        if (c3389v != null) {
            this.f16681f = c3389v.m7789j();
        } else {
            this.f16681f = new i3(2);
        }
        if (z10) {
            this.f16685j = new C0917l(8);
            return;
        }
        if (z11) {
            C0005d c0005d = new C0005d(21);
            this.f16684i = c0005d;
            C3393z type = iz.b0.f17786g;
            AbstractC4154l.m8923f(type, "type");
            if (type.f18003b.equals("multipart")) {
                c0005d.f26d = type;
            } else {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
        }
    }

    /* renamed from: a */
    public final void m7448a(String name, String str, boolean z6) {
        C0917l c0917l = this.f16685j;
        if (z6) {
            c0917l.getClass();
            AbstractC4154l.m8923f(name, "name");
            ((ArrayList) c0917l.f5594b).add(AbstractC8831a.m16285b(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) c0917l.f5595c).add(AbstractC8831a.m16285b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        c0917l.getClass();
        AbstractC4154l.m8923f(name, "name");
        ((ArrayList) c0917l.f5594b).add(AbstractC8831a.m16285b(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) c0917l.f5595c).add(AbstractC8831a.m16285b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    /* renamed from: b */
    public final void m7449b(String str, String str2, boolean z6) {
        if (ObjectMetadata.CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                C5176n c5176n = C3393z.f18000e;
                this.f16682g = h7.m11676d(str2);
                return;
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException(i0.m0.m7378k("Malformed content type: ", str2), e2);
            }
        }
        i3 i3Var = this.f16681f;
        if (z6) {
            i3Var.m5726d(str, str2);
        } else {
            i3Var.m5723a(str, str2);
        }
    }

    /* renamed from: c */
    public final void m7450c(C3389v c3389v, iz.i0 body) {
        C0005d c0005d = this.f16684i;
        c0005d.getClass();
        AbstractC4154l.m8923f(body, "body");
        if (c3389v.m7787b(ObjectMetadata.CONTENT_TYPE) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c3389v.m7787b("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((ArrayList) c0005d.f24b).add(new iz.a0(c3389v, body));
    }

    /* renamed from: d */
    public final void m7451d(String name, String str, boolean z6) {
        String str2 = this.f16678c;
        if (str2 != null) {
            C3391x c3391x = this.f16677b;
            C3390w c3390wM7801f = c3391x.m7801f(str2);
            this.f16679d = c3390wM7801f;
            if (c3390wM7801f == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c3391x + ", Relative: " + this.f16678c);
            }
            this.f16678c = null;
        }
        if (z6) {
            C3390w c3390w = this.f16679d;
            c3390w.getClass();
            AbstractC4154l.m8923f(name, "encodedName");
            if (((ArrayList) c3390w.f17990i) == null) {
                c3390w.f17990i = new ArrayList();
            }
            ArrayList arrayList = (ArrayList) c3390w.f17990i;
            AbstractC4154l.m8920c(arrayList);
            arrayList.add(AbstractC8831a.m16284a(0, 0, 83, name, " \"'<>#&="));
            ArrayList arrayList2 = (ArrayList) c3390w.f17990i;
            AbstractC4154l.m8920c(arrayList2);
            arrayList2.add(str != null ? AbstractC8831a.m16284a(0, 0, 83, str, " \"'<>#&=") : null);
            return;
        }
        C3390w c3390w2 = this.f16679d;
        c3390w2.getClass();
        AbstractC4154l.m8923f(name, "name");
        if (((ArrayList) c3390w2.f17990i) == null) {
            c3390w2.f17990i = new ArrayList();
        }
        ArrayList arrayList3 = (ArrayList) c3390w2.f17990i;
        AbstractC4154l.m8920c(arrayList3);
        arrayList3.add(AbstractC8831a.m16284a(0, 0, 91, name, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList4 = (ArrayList) c3390w2.f17990i;
        AbstractC4154l.m8920c(arrayList4);
        arrayList4.add(str != null ? AbstractC8831a.m16284a(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }
}
