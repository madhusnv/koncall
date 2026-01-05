package d6;

import aj.C0161a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import dj.C1728a;
import e3.C1928d;
import e3.InterfaceC1933i;
import ef.InterfaceC2047g;
import hf.AbstractC2919a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.bouncycastle.iana.AEADAlgorithm;
import p020v.x0;
import qi.InterfaceC6222e;
import ue.InterfaceC7423e;
import ug.C7439j;
import xe.C8357i;
import zi.n2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d6.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C1612b implements InterfaceC7423e, InterfaceC1933i, InterfaceC2047g, InterfaceC6222e {

    /* renamed from: a */
    public final /* synthetic */ int f8042a;

    public /* synthetic */ C1612b(int i10) {
        this.f8042a = i10;
    }

    @Override // e3.InterfaceC1933i
    /* renamed from: a */
    public double mo5263a(double d2) {
        switch (this.f8042a) {
            case 14:
                double d10 = d2 < 0.0d ? -d2 : d2;
                return Math.copySign(d10 >= 0.0031308049535603718d ? (Math.pow(d10, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d10 / 0.07739938080495357d, d2);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                double d11 = d2 < 0.0d ? -d2 : d2;
                return Math.copySign(d11 >= 0.04045d ? Math.pow((0.9478672985781991d * d11) + 0.05213270142180095d, 2.4d) : d11 * 0.07739938080495357d, d2);
            case 16:
                float[] fArr = C1928d.f9103a;
                return C1928d.m5680b(C1928d.f9105c, d2);
            case 17:
                float[] fArr2 = C1928d.f9103a;
                return C1928d.m5679a(C1928d.f9105c, d2);
            case 18:
                float[] fArr3 = C1928d.f9103a;
                return C1928d.m5682d(C1928d.f9106d, d2);
            case 19:
                float[] fArr4 = C1928d.f9103a;
                return C1928d.m5681c(C1928d.f9106d, d2);
            default:
                return d2;
        }
    }

    @Override // ue.InterfaceC7423e
    public Object apply(Object obj) {
        switch (this.f8042a) {
            case 12:
                C1728a.f8372b.getClass();
                return C0161a.f499a.m8776q((n2) obj).getBytes(Charset.forName("UTF-8"));
            case 23:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        C7439j c7439jM15532a = C8357i.m15532a();
                        c7439jM15532a.m13997C(cursorRawQuery.getString(1));
                        c7439jM15532a.f35539d = AbstractC2919a.m7026b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        c7439jM15532a.f35537b = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(c7439jM15532a.m14003n());
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            default:
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
        }
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public Object mo21h(x0 x0Var) {
        switch (this.f8042a) {
            case 26:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(x0Var);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(x0Var);
        }
    }
}
