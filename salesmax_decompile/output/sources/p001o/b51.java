package p001o;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class b51 extends wfc {

    /* renamed from: a */
    public final UUID f15541a;

    /* renamed from: b */
    public final int f15542b;

    /* renamed from: c */
    public final int f15543c;

    /* renamed from: d */
    public final Rect f15544d;

    /* renamed from: e */
    public final Size f15545e;

    /* renamed from: f */
    public final int f15546f;

    /* renamed from: g */
    public final boolean f15547g;

    /* renamed from: h */
    public final boolean f15548h;

    public b51(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z, boolean z2) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f15541a = uuid;
        this.f15542b = i;
        this.f15543c = i2;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f15544d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f15545e = size;
        this.f15546f = i3;
        this.f15547g = z;
        this.f15548h = z2;
    }

    @Override // p001o.wfc
    /* renamed from: a */
    public Rect mo18157a() {
        return this.f15544d;
    }

    @Override // p001o.wfc
    /* renamed from: b */
    public int mo18158b() {
        return this.f15543c;
    }

    @Override // p001o.wfc
    /* renamed from: c */
    public int mo18159c() {
        return this.f15546f;
    }

    @Override // p001o.wfc
    /* renamed from: d */
    public Size mo18160d() {
        return this.f15545e;
    }

    @Override // p001o.wfc
    /* renamed from: e */
    public int mo18161e() {
        return this.f15542b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wfc)) {
            return false;
        }
        wfc wfcVar = (wfc) obj;
        return this.f15541a.equals(wfcVar.mo18162f()) && this.f15542b == wfcVar.mo18161e() && this.f15543c == wfcVar.mo18158b() && this.f15544d.equals(wfcVar.mo18157a()) && this.f15545e.equals(wfcVar.mo18160d()) && this.f15546f == wfcVar.mo18159c() && this.f15547g == wfcVar.mo18163g() && this.f15548h == wfcVar.mo18164j();
    }

    @Override // p001o.wfc
    /* renamed from: f */
    public UUID mo18162f() {
        return this.f15541a;
    }

    @Override // p001o.wfc
    /* renamed from: g */
    public boolean mo18163g() {
        return this.f15547g;
    }

    public int hashCode() {
        return ((((((((((((((this.f15541a.hashCode() ^ 1000003) * 1000003) ^ this.f15542b) * 1000003) ^ this.f15543c) * 1000003) ^ this.f15544d.hashCode()) * 1000003) ^ this.f15545e.hashCode()) * 1000003) ^ this.f15546f) * 1000003) ^ (this.f15547g ? 1231 : 1237)) * 1000003) ^ (this.f15548h ? 1231 : 1237);
    }

    @Override // p001o.wfc
    /* renamed from: j */
    public boolean mo18164j() {
        return this.f15548h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f15541a + ", getTargets=" + this.f15542b + ", getFormat=" + this.f15543c + ", getCropRect=" + this.f15544d + ", getSize=" + this.f15545e + ", getRotationDegrees=" + this.f15546f + ", isMirroring=" + this.f15547g + ", shouldRespectInputCropRect=" + this.f15548h + "}";
    }
}
