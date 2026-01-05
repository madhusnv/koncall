package p8;

import android.view.View;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.HashMap;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.y */
/* loaded from: classes.dex */
public final class C5864y {

    /* renamed from: b */
    public final View f28641b;

    /* renamed from: a */
    public final HashMap f28640a = new HashMap();

    /* renamed from: c */
    public final ArrayList f28642c = new ArrayList();

    public C5864y(View view) {
        this.f28641b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5864y)) {
            return false;
        }
        C5864y c5864y = (C5864y) obj;
        return this.f28641b == c5864y.f28641b && this.f28640a.equals(c5864y.f28640a);
    }

    public final int hashCode() {
        return this.f28640a.hashCode() + (this.f28641b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM11245p = AbstractC5601a.m11245p("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM11245p.append(this.f28641b);
        sbM11245p.append("\n");
        String strM4561h = AbstractC1452a.m4561h(sbM11245p.toString(), "    values:");
        HashMap map = this.f28640a;
        for (String str : map.keySet()) {
            strM4561h = strM4561h + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM4561h;
    }
}
