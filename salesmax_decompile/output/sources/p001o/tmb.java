package p001o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* loaded from: classes3.dex */
public class tmb {

    /* renamed from: a */
    public long f47435a;

    /* renamed from: b */
    public long f47436b;

    /* renamed from: c */
    public TimeInterpolator f47437c;

    /* renamed from: d */
    public int f47438d;

    /* renamed from: e */
    public int f47439e;

    public tmb(long j, long j2) {
        this.f47437c = null;
        this.f47438d = 0;
        this.f47439e = 1;
        this.f47435a = j;
        this.f47436b = j2;
    }

    /* renamed from: b */
    public static tmb m50199b(ValueAnimator valueAnimator) {
        tmb tmbVar = new tmb(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        tmbVar.f47438d = valueAnimator.getRepeatCount();
        tmbVar.f47439e = valueAnimator.getRepeatMode();
        return tmbVar;
    }

    /* renamed from: a */
    public void m50200a(Animator animator) {
        animator.setStartDelay(m50201c());
        animator.setDuration(m50202d());
        animator.setInterpolator(m50203e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m50204f());
            valueAnimator.setRepeatMode(m50205g());
        }
    }

    /* renamed from: c */
    public long m50201c() {
        return this.f47435a;
    }

    /* renamed from: d */
    public long m50202d() {
        return this.f47436b;
    }

    /* renamed from: e */
    public TimeInterpolator m50203e() {
        TimeInterpolator timeInterpolator = this.f47437c;
        return timeInterpolator != null ? timeInterpolator : gh0.f25147b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmb)) {
            return false;
        }
        tmb tmbVar = (tmb) obj;
        if (m50201c() == tmbVar.m50201c() && m50202d() == tmbVar.m50202d() && m50204f() == tmbVar.m50204f() && m50205g() == tmbVar.m50205g()) {
            return m50203e().getClass().equals(tmbVar.m50203e().getClass());
        }
        return false;
    }

    /* renamed from: f */
    public int m50204f() {
        return this.f47438d;
    }

    /* renamed from: g */
    public int m50205g() {
        return this.f47439e;
    }

    public int hashCode() {
        return (((((((((int) (m50201c() ^ (m50201c() >>> 32))) * 31) + ((int) (m50202d() ^ (m50202d() >>> 32)))) * 31) + m50203e().getClass().hashCode()) * 31) + m50204f()) * 31) + m50205g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m50201c() + " duration: " + m50202d() + " interpolator: " + m50203e().getClass() + " repeatCount: " + m50204f() + " repeatMode: " + m50205g() + "}\n";
    }

    public tmb(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f47438d = 0;
        this.f47439e = 1;
        this.f47435a = j;
        this.f47436b = j2;
        this.f47437c = timeInterpolator;
    }
}
