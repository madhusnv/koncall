package y7;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: s */
    public static final List f41791s = Collections.EMPTY_LIST;

    /* renamed from: a */
    public final View f41792a;

    /* renamed from: b */
    public WeakReference f41793b;

    /* renamed from: j */
    public int f41801j;

    /* renamed from: r */
    public RecyclerView f41809r;

    /* renamed from: c */
    public int f41794c = -1;

    /* renamed from: d */
    public int f41795d = -1;

    /* renamed from: e */
    public long f41796e = -1;

    /* renamed from: f */
    public int f41797f = -1;

    /* renamed from: g */
    public int f41798g = -1;

    /* renamed from: h */
    public t0 f41799h = null;

    /* renamed from: i */
    public t0 f41800i = null;

    /* renamed from: k */
    public final ArrayList f41802k = null;

    /* renamed from: l */
    public final List f41803l = null;

    /* renamed from: m */
    public int f41804m = 0;

    /* renamed from: n */
    public l0 f41805n = null;

    /* renamed from: o */
    public boolean f41806o = false;

    /* renamed from: p */
    public int f41807p = 0;

    /* renamed from: q */
    public int f41808q = -1;

    public t0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f41792a = view;
    }

    /* renamed from: a */
    public final void m15916a(int i10) {
        this.f41801j = i10 | this.f41801j;
    }

    /* renamed from: b */
    public final int m15917b() {
        int i10 = this.f41798g;
        return i10 == -1 ? this.f41794c : i10;
    }

    /* renamed from: c */
    public final List m15918c() {
        ArrayList arrayList;
        return ((this.f41801j & 1024) != 0 || (arrayList = this.f41802k) == null || arrayList.size() == 0) ? f41791s : this.f41803l;
    }

    /* renamed from: d */
    public final boolean m15919d() {
        View view = this.f41792a;
        return (view.getParent() == null || view.getParent() == this.f41809r) ? false : true;
    }

    /* renamed from: e */
    public final boolean m15920e() {
        return (this.f41801j & 1) != 0;
    }

    /* renamed from: f */
    public final boolean m15921f() {
        return (this.f41801j & 4) != 0;
    }

    /* renamed from: g */
    public final boolean m15922g() {
        if ((this.f41801j & 16) != 0) {
            return false;
        }
        Field field = c6.v0.f5527a;
        return !this.f41792a.hasTransientState();
    }

    /* renamed from: h */
    public final boolean m15923h() {
        return (this.f41801j & 8) != 0;
    }

    /* renamed from: i */
    public final boolean m15924i() {
        return this.f41805n != null;
    }

    /* renamed from: j */
    public final boolean m15925j() {
        return (this.f41801j & 256) != 0;
    }

    /* renamed from: k */
    public final boolean m15926k() {
        return (this.f41801j & 2) != 0;
    }

    /* renamed from: l */
    public final void m15927l(int i10, boolean z6) {
        if (this.f41795d == -1) {
            this.f41795d = this.f41794c;
        }
        if (this.f41798g == -1) {
            this.f41798g = this.f41794c;
        }
        if (z6) {
            this.f41798g += i10;
        }
        this.f41794c += i10;
        View view = this.f41792a;
        if (view.getLayoutParams() != null) {
            ((g0) view.getLayoutParams()).f41641c = true;
        }
    }

    /* renamed from: m */
    public final void m15928m() {
        this.f41801j = 0;
        this.f41794c = -1;
        this.f41795d = -1;
        this.f41796e = -1L;
        this.f41798g = -1;
        this.f41804m = 0;
        this.f41799h = null;
        this.f41800i = null;
        ArrayList arrayList = this.f41802k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f41801j &= -1025;
        this.f41807p = 0;
        this.f41808q = -1;
        RecyclerView.m1318i(this);
    }

    /* renamed from: n */
    public final void m15929n(boolean z6) {
        int i10 = this.f41804m;
        int i11 = z6 ? i10 - 1 : i10 + 1;
        this.f41804m = i11;
        if (i11 < 0) {
            this.f41804m = 0;
            toString();
        } else if (!z6 && i11 == 1) {
            this.f41801j |= 16;
        } else if (z6 && i11 == 0) {
            this.f41801j &= -17;
        }
    }

    /* renamed from: o */
    public final boolean m15930o() {
        return (this.f41801j & 128) != 0;
    }

    /* renamed from: p */
    public final boolean m15931p() {
        return (this.f41801j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sbM11245p = AbstractC5601a.m11245p(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbM11245p.append(Integer.toHexString(hashCode()));
        sbM11245p.append(" position=");
        sbM11245p.append(this.f41794c);
        sbM11245p.append(" id=");
        sbM11245p.append(this.f41796e);
        sbM11245p.append(", oldPos=");
        sbM11245p.append(this.f41795d);
        sbM11245p.append(", pLpos:");
        sbM11245p.append(this.f41798g);
        StringBuilder sb2 = new StringBuilder(sbM11245p.toString());
        if (m15924i()) {
            sb2.append(" scrap ");
            sb2.append(this.f41806o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m15921f()) {
            sb2.append(" invalid");
        }
        if (!m15920e()) {
            sb2.append(" unbound");
        }
        if ((this.f41801j & 2) != 0) {
            sb2.append(" update");
        }
        if (m15923h()) {
            sb2.append(" removed");
        }
        if (m15930o()) {
            sb2.append(" ignored");
        }
        if (m15925j()) {
            sb2.append(" tmpDetached");
        }
        if (!m15922g()) {
            sb2.append(" not recyclable(" + this.f41804m + ")");
        }
        if ((this.f41801j & 512) != 0 || m15921f()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f41792a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
