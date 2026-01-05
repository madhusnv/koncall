package p001o;

import ai.salesmax.model.FileData;
import ai.salesmax.model.UploadedFileSummary;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public abstract class gq9 {
    /* renamed from: A */
    public static /* synthetic */ x8c m29276A(Context context, Uri uri, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, l1 l1Var) {
        return l1Var.Hn(context, uri, l1Var.on(), l1Var.Eo(), str, "PUBLIC", str2).d0(new rl7() { // from class: o.up9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gq9.m29306y(str, str2, str3, str4, str5, str6, str7, (String) obj);
            }
        }).d0(new rl7() { // from class: o.vp9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gq9.m29307z((FileData) obj);
            }
        }).d0(new eq9()).m55717M(new fq9(l1Var)).d0(new sp9());
    }

    /* renamed from: B */
    public static x6c m29277B(Context context, Uri uri, String str, String str2) {
        return m29278C(context, uri, str, str2, null, null);
    }

    /* renamed from: C */
    public static x6c m29278C(Context context, Uri uri, String str, String str2, String str3, String str4) {
        return m29279D(context, uri, str, str2, str3, str4, null, null, null);
    }

    /* renamed from: D */
    public static x6c m29279D(final Context context, final Uri uri, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        return m29292k().m55717M(new rl7() { // from class: o.yp9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gq9.m29276A(context, uri, str, str2, str3, str4, str7, str5, str6, (l1) obj);
            }
        });
    }

    /* renamed from: E */
    public static x6c m29280E(File file, String str, String str2) {
        return m29281F(file, str, str2, null, null);
    }

    /* renamed from: F */
    public static x6c m29281F(final File file, final String str, final String str2, final String str3, final String str4) {
        return m29292k().m55717M(new rl7() { // from class: o.xp9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gq9.m29305x(file, str, str2, str3, str4, (l1) obj);
            }
        });
    }

    /* renamed from: k */
    public static x6c m29292k() {
        return uni.LB().d0(new gd()).d0(new hd());
    }

    /* renamed from: l */
    public static x6c m29293l(String str, File file) {
        return uni.kC().TB().nh(str, file, "PUBLIC");
    }

    /* renamed from: m */
    public static x6c m29294m(final String str) {
        return m29292k().m55717M(new rl7() { // from class: o.rp9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gq9.m29299r(str, (l1) obj);
            }
        });
    }

    /* renamed from: n */
    public static URL m29295n(String str) {
        try {
            return (URL) m29294m(str).m55727f();
        } catch (Exception unused) {
            String.format("Couldn't find url for key %s", str);
            return null;
        }
    }

    /* renamed from: o */
    public static x6c m29296o(final String str) {
        return str.contains("/") ? m29294m(str) : m29292k().m55717M(new rl7() { // from class: o.zp9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gq9.m29300s(str, (l1) obj);
            }
        }).d0(new aq9()).m55717M(new rl7() { // from class: o.bq9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gq9.m29294m((String) obj);
            }
        });
    }

    /* renamed from: p */
    public static x6c m29297p(final String str) {
        return m29292k().m55717M(new rl7() { // from class: o.wp9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gq9.m29301t(str, (l1) obj);
            }
        });
    }

    /* renamed from: q */
    public static x6c m29298q(final String str) {
        return str.contains("/") ? x6c.c0(str) : m29292k().m55717M(new rl7() { // from class: o.tp9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gq9.m29302u(str, (l1) obj);
            }
        }).d0(new aq9());
    }

    /* renamed from: r */
    public static /* synthetic */ x8c m29299r(String str, l1 l1Var) {
        return l1Var.S0(str);
    }

    /* renamed from: s */
    public static /* synthetic */ x8c m29300s(String str, l1 l1Var) {
        return l1Var.bq(str).h0();
    }

    /* renamed from: t */
    public static /* synthetic */ x8c m29301t(String str, l1 l1Var) {
        return m29294m(l1Var.Zn(str));
    }

    /* renamed from: u */
    public static /* synthetic */ x8c m29302u(String str, l1 l1Var) {
        return l1Var.bq(str).h0();
    }

    /* renamed from: v */
    public static /* synthetic */ FileData m29303v(String str, String str2, String str3, String str4, String str5) {
        return new FileData(0, null, str, str2, str5, "", true, true, false, null, null, null, null, null, null, str3, null, str4, null, false, null, null, null, null, null, null, null, null);
    }

    /* renamed from: w */
    public static /* synthetic */ UploadedFileSummary m29304w(FileData fileData) {
        return fileData.toUploadedFileSummary(null);
    }

    /* renamed from: x */
    public static /* synthetic */ x8c m29305x(File file, final String str, final String str2, final String str3, final String str4, l1 l1Var) {
        return l1Var.cw(file, l1Var.on(), l1Var.Eo(), str, "PUBLIC", str2).d0(new rl7() { // from class: o.cq9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gq9.m29303v(str, str2, str3, str4, (String) obj);
            }
        }).d0(new rl7() { // from class: o.dq9
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gq9.m29304w((FileData) obj);
            }
        }).d0(new eq9()).m55717M(new fq9(l1Var)).d0(new sp9());
    }

    /* renamed from: y */
    public static /* synthetic */ FileData m29306y(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new FileData(0, null, str, str2, str8, "", true, true, false, null, null, null, null, null, null, str3, str4, str5, null, false, str6, str7, null, null, null, null, null, null);
    }

    /* renamed from: z */
    public static /* synthetic */ UploadedFileSummary m29307z(FileData fileData) {
        return fileData.toUploadedFileSummary(null);
    }
}
