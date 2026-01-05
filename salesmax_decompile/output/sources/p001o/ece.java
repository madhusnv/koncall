package p001o;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.DialogInterfaceC1782a;

/* loaded from: classes6.dex */
public class ece {

    /* renamed from: a */
    public String f21396a;

    /* renamed from: b */
    public String f21397b;

    /* renamed from: c */
    public int f21398c;

    /* renamed from: d */
    public int f21399d;

    /* renamed from: e */
    public String f21400e;

    /* renamed from: f */
    public String[] f21401f;

    public ece(String str, String str2, String str3, int i, int i2, String[] strArr) {
        this.f21396a = str;
        this.f21397b = str2;
        this.f21400e = str3;
        this.f21398c = i;
        this.f21399d = i2;
        this.f21401f = strArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v5 ??, still in use, count: 2, list:
          (r0v5 ?? I:lombok.launch.PatchFixesHider$Transform) from 0x0008: INVOKE (r0v5 ?? I:lombok.launch.PatchFixesHider$Transform), (r3v0 android.content.Context) DIRECT call: lombok.launch.PatchFixesHider.Transform.init(java.lang.ClassLoader):void A[MD:(java.lang.ClassLoader):void (m)] (LINE:9)
          (r0v5 ??) from MOVE (r0v7 ??) = (r0v5 ??) A[SYNTHETIC]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object[], lombok.launch.PatchFixesHider$Util] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.app.AlertDialog$Builder, lombok.launch.PatchFixesHider$Transform] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.app.AlertDialog$Builder, java.lang.Object] */
    /* renamed from: a */
    public android.app.AlertDialog m24777a(android.content.Context r3, android.content.DialogInterface.OnClickListener r4) {
        /*
            r2 = this;
            int r0 = r2.f21398c
            if (r0 <= 0) goto Lc
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            int r1 = r2.f21398c
            r0.init(r3)
            goto L11
        Lc:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
        L11:
            r3 = 0
            java.lang.Object r3 = r0.invokeMethod(r3, r0)
            java.lang.String r0 = r2.f21396a
            android.app.AlertDialog$Builder r3 = r3.setPositiveButton(r0, r4)
            java.lang.String r0 = r2.f21397b
            android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r0, r4)
            java.lang.String r4 = r2.f21400e
            android.app.AlertDialog$Builder r3 = r3.setMessage(r4)
            android.app.AlertDialog r3 = r3.create()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p001o.ece.m24777a(android.content.Context, android.content.DialogInterface$OnClickListener):android.app.AlertDialog");
    }

    /* renamed from: b */
    public DialogInterfaceC1782a m24778b(Context context, DialogInterface.OnClickListener onClickListener) {
        int i = this.f21398c;
        return (i > 0 ? new DialogInterfaceC1782a.a(context, i) : new DialogInterfaceC1782a.a(context)).mo3869b(false).mo3878k(this.f21396a, onClickListener).mo3874g(this.f21397b, onClickListener).mo3873f(this.f21400e).create();
    }

    /* renamed from: c */
    public Bundle m24779c() {
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", this.f21396a);
        bundle.putString("negativeButton", this.f21397b);
        bundle.putString("rationaleMsg", this.f21400e);
        bundle.putInt("theme", this.f21398c);
        bundle.putInt("requestCode", this.f21399d);
        bundle.putStringArray("permissions", this.f21401f);
        return bundle;
    }

    public ece(Bundle bundle) {
        this.f21396a = bundle.getString("positiveButton");
        this.f21397b = bundle.getString("negativeButton");
        this.f21400e = bundle.getString("rationaleMsg");
        this.f21398c = bundle.getInt("theme");
        this.f21399d = bundle.getInt("requestCode");
        this.f21401f = bundle.getStringArray("permissions");
    }
}
