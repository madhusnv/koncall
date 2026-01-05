package sf;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.q */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC6831q implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f32480a;

    /* renamed from: b */
    public final /* synthetic */ Intent f32481b;

    /* renamed from: c */
    public final /* synthetic */ Object f32482c;

    public /* synthetic */ DialogInterfaceOnClickListenerC6831q(Intent intent, Object obj, int i10) {
        this.f32480a = i10;
        this.f32481b = intent;
        this.f32482c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, rf.g] */
    /* renamed from: a */
    public final void m13026a() {
        switch (this.f32480a) {
            case 0:
                Intent intent = this.f32481b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f32482c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f32481b;
                if (intent2 != null) {
                    this.f32482c.startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                m13026a();
            } catch (ActivityNotFoundException unused) {
                Build.FINGERPRINT.contains("generic");
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
