package p3;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import c3.C0847b;
import c9.C0927v;
import com.google.android.gms.internal.measurement.j4;
import com.sun.mail.imap.IMAPStore;
import ex.InterfaceC2139c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p3.p */
/* loaded from: classes.dex */
public abstract class AbstractC5818p {

    /* renamed from: a */
    public static final C5803a f28473a = new C5803a(IMAPStore.RESPONSE);

    /* renamed from: b */
    public static final C5803a f28474b;

    /* renamed from: c */
    public static final StackTraceElement[] f28475c;

    static {
        new C5803a(1007);
        new C5803a(1008);
        f28474b = new C5803a(1002);
        f28475c = new StackTraceElement[0];
    }

    /* renamed from: a */
    public static final boolean m11397a(C5819q c5819q) {
        return !c5819q.f28483h && c5819q.f28479d;
    }

    /* renamed from: b */
    public static final boolean m11398b(C5819q c5819q) {
        return (c5819q.m11406b() || !c5819q.f28483h || c5819q.f28479d) ? false : true;
    }

    /* renamed from: c */
    public static final boolean m11399c(C5819q c5819q) {
        return c5819q.f28483h && !c5819q.f28479d;
    }

    /* renamed from: d */
    public static final boolean m11400d(long j6, long j10) {
        return j6 == j10;
    }

    /* renamed from: e */
    public static final boolean m11401e(C5819q c5819q, long j6, long j10) {
        int i10 = c5819q.f28484i == 1 ? 1 : 0;
        long j11 = c5819q.f28478c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        float f6 = i10;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32)) * f6;
        float f10 = ((int) (j6 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f6;
        return (fIntBitsToFloat > f10) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j6 & 4294967295L)) + fIntBitsToFloat4);
    }

    /* renamed from: f */
    public static InterfaceC7879r m11402f(InterfaceC7879r interfaceC7879r, C5803a c5803a) {
        return interfaceC7879r.mo14852e(new PointerHoverIconModifierElement(c5803a));
    }

    /* renamed from: g */
    public static final long m11403g(C5819q c5819q, boolean z6) {
        long jM2275f = C0847b.m2275f(c5819q.f28478c, c5819q.f28482g);
        if (z6 || !c5819q.m11406b()) {
            return jM2275f;
        }
        return 0L;
    }

    /* renamed from: h */
    public static final void m11404h(C5812j c5812j, long j6, InterfaceC2139c interfaceC2139c, boolean z6) {
        j4 j4Var = c5812j.f28468b;
        MotionEvent motionEvent = j4Var != null ? (MotionEvent) ((C0927v) j4Var.f6253d).f5669c : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z6) {
            motionEvent.setAction(3);
        }
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        interfaceC2139c.invoke(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        motionEvent.setAction(action);
    }
}
