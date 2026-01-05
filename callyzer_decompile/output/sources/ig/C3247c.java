package ig;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.credentials.playservices.HiddenActivity;
import c9.C0910e;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import lf.C4459j;
import lf.C4461l;
import lf.C4463n;
import oj.C5392d;
import pg.AbstractC5933n;
import qf.AbstractC6206e;
import qf.C6205d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ig.c */
/* loaded from: classes.dex */
public final class C3247c extends AbstractC6206e {

    /* renamed from: l */
    public static final C0910e f17421l = new C0910e("Auth.Api.Identity.CredentialSaving.API", new C3245a(0), new C5392d(25));

    /* renamed from: m */
    public static final C0910e f17422m = new C0910e("Auth.Api.Identity.SignIn.API", new C3245a(1), new C5392d(25));

    /* renamed from: k */
    public final String f17423k;

    public C3247c(HiddenActivity hiddenActivity, C4461l c4461l) {
        super(hiddenActivity, hiddenActivity, f17421l, c4461l, C6205d.f30184c);
        this.f17423k = AbstractC3251g.m7596a();
    }

    /* renamed from: c */
    public C4459j m7585c(Intent intent) throws ApiException {
        Status status = Status.f6004g;
        if (intent == null) {
            throw new ApiException(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : AbstractC5933n.m11793a(byteArrayExtra, creator));
        if (status2 == null) {
            throw new ApiException(Status.f6006j);
        }
        if (!status2.m3092b()) {
            throw new ApiException(status2);
        }
        Parcelable.Creator<C4459j> creator2 = C4459j.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        C4459j c4459j = (C4459j) (byteArrayExtra2 != null ? AbstractC5933n.m11793a(byteArrayExtra2, creator2) : null);
        if (c4459j != null) {
            return c4459j;
        }
        throw new ApiException(status);
    }

    public C3247c(HiddenActivity hiddenActivity, C4463n c4463n) {
        super(hiddenActivity, hiddenActivity, f17422m, c4463n, C6205d.f30184c);
        this.f17423k = AbstractC3251g.m7596a();
    }

    public C3247c(Context context, C4463n c4463n) {
        super(context, null, f17422m, c4463n, C6205d.f30184c);
        this.f17423k = AbstractC3251g.m7596a();
    }
}
