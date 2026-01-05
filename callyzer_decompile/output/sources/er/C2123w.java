package er;

import android.content.Intent;
import aws.smithy.kotlin.runtime.identity.IdentityProviderException;
import ba.C0636f;
import com.websoptimization.callyzerbiz.MainActivity;
import ex.InterfaceC2137a;
import gr.C2713i;
import iz.C3388u;
import iz.C3391x;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4166x;
import mq.C4837e;
import mq.h0;
import p005f.C2162k;
import qw.C6376z;
import qw.a0;
import sb.C6780g;
import vc.InterfaceC7700c;
import zc.C8934k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.w */
/* loaded from: classes3.dex */
public final class C2123w implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f9922a;

    /* renamed from: b */
    public final /* synthetic */ Object f9923b;

    public /* synthetic */ C2123w(int i10, Object obj) {
        this.f9922a = i10;
        this.f9923b = obj;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f9922a) {
            case 0:
                ((C2713i) this.f9923b).m6713f(C2102b.f9854a);
                return a0.f30746a;
            case 1:
                MainActivity mainActivity = (MainActivity) this.f9923b;
                MainActivity.m4582e(mainActivity, new C0636f(2, mainActivity));
                return a0.f30746a;
            case 2:
                ((h0) this.f9923b).m9801m(C4837e.f24200a);
                return a0.f30746a;
            case 3:
                return "dns query: domain=" + ((String) this.f9923b);
            case 4:
                return "proxy select start: url=" + ((C3391x) this.f9923b);
            case 5:
                return "response headers end: contentLengthHeader=" + ((Long) this.f9923b);
            case 6:
                return "TLS connect end: handshake=" + ((C3388u) this.f9923b);
            case 7:
                return "retrying request, attempt " + ((C4166x) this.f9923b).f21162a;
            case 8:
                return "Attempting to resolve identity from " + ((InterfaceC7700c) this.f9923b);
            case 9:
                String message = "No identity could be resolved from the chain: " + ((C6780g) this.f9923b);
                AbstractC4154l.m8923f(message, "message");
                return new IdentityProviderException(message, null);
            case 10:
                byte[] bArr = ((C8934k) this.f9923b).f42904a;
                int length = bArr.length / 2;
                short[] sArr = new short[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    if (i11 > bArr.length - 2) {
                        throw new IllegalStateException("Check failed.");
                    }
                    sArr[i10] = (short) ((bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8));
                }
                return new C6376z(sArr);
            default:
                ((C2162k) this.f9923b).mo1274a(new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                return a0.f30746a;
        }
    }
}
