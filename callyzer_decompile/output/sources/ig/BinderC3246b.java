package ig;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import b2.C0554l;
import bl.C0689a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import kf.AbstractC4074a;
import lf.C4455f;
import lf.C4458i;
import mf.C4718a;
import nf.AbstractC5046h;
import nf.C5040b;
import nf.C5045g;
import nf.C5047i;
import nf.RunnableC5041c;
import ng.C5070u;
import og.de;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.json.JSONException;
import qf.C6205d;
import qf.C6212k;
import rf.C6506k;
import rf.C6507l;
import rf.C6513r;
import sf.AbstractC6840z;
import yg.C8650g;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ig.b */
/* loaded from: classes.dex */
public final class BinderC3246b extends AbstractBinderC3252h {

    /* renamed from: f */
    public final /* synthetic */ int f17419f;

    /* renamed from: g */
    public final Object f17420g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3246b(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 0);
        this.f17419f = 3;
        this.f17420g = revocationBoundService;
    }

    @Override // ig.AbstractBinderC3252h
    /* renamed from: P */
    public final boolean mo7583P(int i10, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String strM9960d;
        int i11 = this.f17419f;
        Object obj = this.f17420g;
        switch (i11) {
            case 0:
                if (i10 != 1) {
                    return false;
                }
                Status status = (Status) AbstractC3253i.m7598a(parcel, Status.CREATOR);
                C4458i c4458i = (C4458i) AbstractC3253i.m7598a(parcel, C4458i.CREATOR);
                AbstractC3253i.m7599b(parcel);
                de.m10609a(status, c4458i, (C8650g) obj);
                return true;
            case 1:
                if (i10 != 1) {
                    return false;
                }
                Status status2 = (Status) AbstractC3253i.m7598a(parcel, Status.CREATOR);
                C4455f c4455f = (C4455f) AbstractC3253i.m7598a(parcel, C4455f.CREATOR);
                AbstractC3253i.m7599b(parcel);
                de.m10609a(status2, c4455f, (C8650g) obj);
                return true;
            case 2:
                if (i10 != 1) {
                    return false;
                }
                Status status3 = (Status) AbstractC3253i.m7598a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) AbstractC3253i.m7598a(parcel, PendingIntent.CREATOR);
                AbstractC3253i.m7599b(parcel);
                de.m10609a(status3, pendingIntent, (C8650g) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    m7584R();
                    C5047i.m9974Z(revocationBoundService).a0();
                    return true;
                }
                m7584R();
                C5040b c5040bM9956a = C5040b.m9956a(revocationBoundService);
                GoogleSignInAccount googleSignInAccountM9958b = c5040bM9956a.m9958b();
                GoogleSignInOptions googleSignInOptionsM3087b = GoogleSignInOptions.f5971l;
                if (googleSignInAccountM9958b != null) {
                    String strM9960d2 = c5040bM9956a.m9960d("defaultGoogleSignInAccount");
                    if (TextUtils.isEmpty(strM9960d2) || (strM9960d = c5040bM9956a.m9960d(C5040b.m9957f("googleSignInOptions", strM9960d2))) == null) {
                        googleSignInOptionsM3087b = null;
                    } else {
                        try {
                            googleSignInOptionsM3087b = GoogleSignInOptions.m3087b(strM9960d);
                        } catch (JSONException unused) {
                        }
                    }
                }
                GoogleSignInOptions googleSignInOptions = googleSignInOptionsM3087b;
                AbstractC6840z.m13036g(googleSignInOptions);
                C4718a c4718a = new C4718a((RevocationBoundService) obj, null, AbstractC4074a.f20942a, googleSignInOptions, new C6205d(new C5070u(26), Looper.getMainLooper()));
                int i12 = 27;
                Context context = c4718a.f30187a;
                C6513r c6513r = c4718a.f30194h;
                if (googleSignInAccountM9958b == null) {
                    boolean z6 = c4718a.m9585c() == 3;
                    C0554l c0554l = AbstractC5046h.f24820a;
                    Object[] objArr = new Object[0];
                    if (c0554l.f3778b <= 3) {
                        c0554l.m1635d("Signing out", objArr);
                    }
                    AbstractC5046h.m9968a(context);
                    if (z6) {
                        BasePendingResult c6506k = new C6506k(c6513r);
                        c6506k.m3097e(Status.f6002e);
                        basePendingResult = c6506k;
                    } else {
                        C5045g c5045g = new C5045g(c6513r, 0);
                        c6513r.m12543a(c5045g);
                        basePendingResult = c5045g;
                    }
                    basePendingResult.m3093a(new C6507l(basePendingResult, new C8650g(), new C0689a(i12)));
                    return true;
                }
                boolean z10 = c4718a.m9585c() == 3;
                C0554l c0554l2 = AbstractC5046h.f24820a;
                Object[] objArr2 = new Object[0];
                if (c0554l2.f3778b <= 3) {
                    c0554l2.m1635d("Revoking access", objArr2);
                }
                String strM9960d3 = C5040b.m9956a(context).m9960d("refreshToken");
                AbstractC5046h.m9968a(context);
                if (!z10) {
                    C5045g c5045g2 = new C5045g(c6513r, 1);
                    c6513r.m12543a(c5045g2);
                    basePendingResult2 = c5045g2;
                } else if (strM9960d3 == null) {
                    C0554l c0554l3 = RunnableC5041c.f24803c;
                    Status status4 = new Status(4, null, null, null);
                    AbstractC6840z.m13030a("Status code must not be SUCCESS", !status4.m3092b());
                    BasePendingResult c6212k = new C6212k(status4);
                    c6212k.m3097e(status4);
                    basePendingResult2 = c6212k;
                } else {
                    RunnableC5041c runnableC5041c = new RunnableC5041c(strM9960d3);
                    new Thread(runnableC5041c).start();
                    basePendingResult2 = runnableC5041c.f24805b;
                }
                basePendingResult2.m3093a(new C6507l(basePendingResult2, new C8650g(), new C0689a(i12)));
                return true;
        }
    }

    /* renamed from: R */
    public void m7584R() {
        if (!AbstractC8947b.m16429f((RevocationBoundService) this.f17420g, Binder.getCallingUid())) {
            throw new SecurityException(AbstractC5601a.m11232c(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3246b(C8650g c8650g, int i10) {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback", 0);
        this.f17419f = i10;
        switch (i10) {
            case 1:
                this.f17420g = c8650g;
                super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 0);
                break;
            case 2:
                this.f17420g = c8650g;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 0);
                break;
            default:
                this.f17420g = c8650g;
                break;
        }
    }
}
