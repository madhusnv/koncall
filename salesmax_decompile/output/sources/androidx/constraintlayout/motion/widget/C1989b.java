package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;
import p001o.k75;
import p001o.mbe;

/* renamed from: androidx.constraintlayout.motion.widget.b */
/* loaded from: classes2.dex */
public class C1989b {

    /* renamed from: G */
    public static final float[][] f6683G = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: H */
    public static final float[][] f6684H = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: r */
    public float f6708r;

    /* renamed from: s */
    public float f6709s;

    /* renamed from: t */
    public final MotionLayout f6710t;

    /* renamed from: a */
    public int f6691a = 0;

    /* renamed from: b */
    public int f6692b = 0;

    /* renamed from: c */
    public int f6693c = 0;

    /* renamed from: d */
    public int f6694d = -1;

    /* renamed from: e */
    public int f6695e = -1;

    /* renamed from: f */
    public int f6696f = -1;

    /* renamed from: g */
    public float f6697g = 0.5f;

    /* renamed from: h */
    public float f6698h = 0.5f;

    /* renamed from: i */
    public float f6699i = 0.5f;

    /* renamed from: j */
    public float f6700j = 0.5f;

    /* renamed from: k */
    public int f6701k = -1;

    /* renamed from: l */
    public boolean f6702l = false;

    /* renamed from: m */
    public float f6703m = 0.0f;

    /* renamed from: n */
    public float f6704n = 1.0f;

    /* renamed from: o */
    public boolean f6705o = false;

    /* renamed from: p */
    public float[] f6706p = new float[2];

    /* renamed from: q */
    public int[] f6707q = new int[2];

    /* renamed from: u */
    public float f6711u = 4.0f;

    /* renamed from: v */
    public float f6712v = 1.2f;

    /* renamed from: w */
    public boolean f6713w = true;

    /* renamed from: x */
    public float f6714x = 1.0f;

    /* renamed from: y */
    public int f6715y = 0;

    /* renamed from: z */
    public float f6716z = 10.0f;

    /* renamed from: A */
    public float f6685A = 10.0f;

    /* renamed from: B */
    public float f6686B = 1.0f;

    /* renamed from: C */
    public float f6687C = Float.NaN;

    /* renamed from: D */
    public float f6688D = Float.NaN;

    /* renamed from: E */
    public int f6689E = 0;

    /* renamed from: F */
    public int f6690F = 0;

    /* renamed from: androidx.constraintlayout.motion.widget.b$a */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.b$b */
    public class b implements NestedScrollView.InterfaceC2036d {
        public b() {
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC2036d
        /* renamed from: a */
        public void mo5529a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    public C1989b(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f6710t = motionLayout;
        m5505c(context, Xml.asAttributeSet(xmlPullParser));
    }

    /* renamed from: A */
    public void m5502A() {
        View viewFindViewById;
        int i = this.f6694d;
        if (i != -1) {
            viewFindViewById = this.f6710t.findViewById(i);
            if (viewFindViewById == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("cannot find TouchAnchorId @id/");
                sb.append(k75.m35104c(this.f6710t.getContext(), this.f6694d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new b());
        }
    }

    /* renamed from: a */
    public float m5503a(float f, float f2) {
        return (f * this.f6703m) + (f2 * this.f6704n);
    }

    /* renamed from: b */
    public final void m5504b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == mbe.OnSwipe_touchAnchorId) {
                this.f6694d = typedArray.getResourceId(index, this.f6694d);
            } else if (index == mbe.OnSwipe_touchAnchorSide) {
                int i2 = typedArray.getInt(index, this.f6691a);
                this.f6691a = i2;
                float[] fArr = f6683G[i2];
                this.f6698h = fArr[0];
                this.f6697g = fArr[1];
            } else if (index == mbe.OnSwipe_dragDirection) {
                int i3 = typedArray.getInt(index, this.f6692b);
                this.f6692b = i3;
                float[][] fArr2 = f6684H;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.f6703m = fArr3[0];
                    this.f6704n = fArr3[1];
                } else {
                    this.f6704n = Float.NaN;
                    this.f6703m = Float.NaN;
                    this.f6702l = true;
                }
            } else if (index == mbe.OnSwipe_maxVelocity) {
                this.f6711u = typedArray.getFloat(index, this.f6711u);
            } else if (index == mbe.OnSwipe_maxAcceleration) {
                this.f6712v = typedArray.getFloat(index, this.f6712v);
            } else if (index == mbe.OnSwipe_moveWhenScrollAtTop) {
                this.f6713w = typedArray.getBoolean(index, this.f6713w);
            } else if (index == mbe.OnSwipe_dragScale) {
                this.f6714x = typedArray.getFloat(index, this.f6714x);
            } else if (index == mbe.OnSwipe_dragThreshold) {
                this.f6716z = typedArray.getFloat(index, this.f6716z);
            } else if (index == mbe.OnSwipe_touchRegionId) {
                this.f6695e = typedArray.getResourceId(index, this.f6695e);
            } else if (index == mbe.OnSwipe_onTouchUp) {
                this.f6693c = typedArray.getInt(index, this.f6693c);
            } else if (index == mbe.OnSwipe_nestedScrollFlags) {
                this.f6715y = typedArray.getInteger(index, 0);
            } else if (index == mbe.OnSwipe_limitBoundsTo) {
                this.f6696f = typedArray.getResourceId(index, 0);
            } else if (index == mbe.OnSwipe_rotationCenterId) {
                this.f6701k = typedArray.getResourceId(index, this.f6701k);
            } else if (index == mbe.OnSwipe_springDamping) {
                this.f6685A = typedArray.getFloat(index, this.f6685A);
            } else if (index == mbe.OnSwipe_springMass) {
                this.f6686B = typedArray.getFloat(index, this.f6686B);
            } else if (index == mbe.OnSwipe_springStiffness) {
                this.f6687C = typedArray.getFloat(index, this.f6687C);
            } else if (index == mbe.OnSwipe_springStopThreshold) {
                this.f6688D = typedArray.getFloat(index, this.f6688D);
            } else if (index == mbe.OnSwipe_springBoundary) {
                this.f6689E = typedArray.getInt(index, this.f6689E);
            } else if (index == mbe.OnSwipe_autoCompleteMode) {
                this.f6690F = typedArray.getInt(index, this.f6690F);
            }
        }
    }

    /* renamed from: c */
    public final void m5505c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.OnSwipe);
        m5504b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public int m5506d() {
        return this.f6690F;
    }

    /* renamed from: e */
    public int m5507e() {
        return this.f6715y;
    }

    /* renamed from: f */
    public RectF m5508f(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f6696f;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* renamed from: g */
    public float m5509g() {
        return this.f6712v;
    }

    /* renamed from: h */
    public float m5510h() {
        return this.f6711u;
    }

    /* renamed from: i */
    public boolean m5511i() {
        return this.f6713w;
    }

    /* renamed from: j */
    public float m5512j(float f, float f2) throws Resources.NotFoundException {
        this.f6710t.n0(this.f6694d, this.f6710t.getProgress(), this.f6698h, this.f6697g, this.f6706p);
        float f3 = this.f6703m;
        if (f3 != 0.0f) {
            float[] fArr = this.f6706p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.f6706p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.f6704n) / fArr2[1];
    }

    /* renamed from: k */
    public int m5513k() {
        return this.f6689E;
    }

    /* renamed from: l */
    public float m5514l() {
        return this.f6685A;
    }

    /* renamed from: m */
    public float m5515m() {
        return this.f6686B;
    }

    /* renamed from: n */
    public float m5516n() {
        return this.f6687C;
    }

    /* renamed from: o */
    public float m5517o() {
        return this.f6688D;
    }

    /* renamed from: p */
    public RectF m5518p(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f6695e;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* renamed from: q */
    public int m5519q() {
        return this.f6695e;
    }

    /* renamed from: r */
    public boolean m5520r() {
        return this.f6705o;
    }

    /* renamed from: s */
    public void m5521s(MotionEvent motionEvent, MotionLayout.InterfaceC1983f interfaceC1983f, int i, C1988a c1988a) throws Resources.NotFoundException {
        int i2;
        if (this.f6702l) {
            m5522t(motionEvent, interfaceC1983f, i, c1988a);
            return;
        }
        interfaceC1983f.mo5400c(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6708r = motionEvent.getRawX();
            this.f6709s = motionEvent.getRawY();
            this.f6705o = false;
            return;
        }
        if (action == 1) {
            this.f6705o = false;
            interfaceC1983f.mo5403f(1000);
            float fMo5402e = interfaceC1983f.mo5402e();
            float fMo5401d = interfaceC1983f.mo5401d();
            float progress = this.f6710t.getProgress();
            int i3 = this.f6694d;
            if (i3 != -1) {
                this.f6710t.n0(i3, progress, this.f6698h, this.f6697g, this.f6706p);
            } else {
                float fMin = Math.min(this.f6710t.getWidth(), this.f6710t.getHeight());
                float[] fArr = this.f6706p;
                fArr[1] = this.f6704n * fMin;
                fArr[0] = fMin * this.f6703m;
            }
            float f = this.f6703m;
            float[] fArr2 = this.f6706p;
            float fAbs = f != 0.0f ? fMo5402e / fArr2[0] : fMo5401d / fArr2[1];
            float f2 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + progress : progress;
            if (f2 == 0.0f || f2 == 1.0f || (i2 = this.f6693c) == 3) {
                if (0.0f >= f2 || 1.0f <= f2) {
                    this.f6710t.setState(MotionLayout.EnumC1987j.FINISHED);
                    return;
                }
                return;
            }
            float f3 = ((double) f2) < 0.5d ? 0.0f : 1.0f;
            if (i2 == 6) {
                if (progress + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f3 = 1.0f;
            }
            if (this.f6693c == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f3 = 0.0f;
            }
            this.f6710t.B0(this.f6693c, f3, fAbs);
            if (0.0f >= progress || 1.0f <= progress) {
                this.f6710t.setState(MotionLayout.EnumC1987j.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f6709s;
        float rawX = motionEvent.getRawX() - this.f6708r;
        if (Math.abs((this.f6703m * rawX) + (this.f6704n * rawY)) > this.f6716z || this.f6705o) {
            float progress2 = this.f6710t.getProgress();
            if (!this.f6705o) {
                this.f6705o = true;
                this.f6710t.setProgress(progress2);
            }
            int i4 = this.f6694d;
            if (i4 != -1) {
                this.f6710t.n0(i4, progress2, this.f6698h, this.f6697g, this.f6706p);
            } else {
                float fMin2 = Math.min(this.f6710t.getWidth(), this.f6710t.getHeight());
                float[] fArr3 = this.f6706p;
                fArr3[1] = this.f6704n * fMin2;
                fArr3[0] = fMin2 * this.f6703m;
            }
            float f4 = this.f6703m;
            float[] fArr4 = this.f6706p;
            if (Math.abs(((f4 * fArr4[0]) + (this.f6704n * fArr4[1])) * this.f6714x) < 0.01d) {
                float[] fArr5 = this.f6706p;
                fArr5[0] = 0.01f;
                fArr5[1] = 0.01f;
            }
            float fMax = Math.max(Math.min(progress2 + (this.f6703m != 0.0f ? rawX / this.f6706p[0] : rawY / this.f6706p[1]), 1.0f), 0.0f);
            if (this.f6693c == 6) {
                fMax = Math.max(fMax, 0.01f);
            }
            if (this.f6693c == 7) {
                fMax = Math.min(fMax, 0.99f);
            }
            float progress3 = this.f6710t.getProgress();
            if (fMax != progress3) {
                if (progress3 == 0.0f || progress3 == 1.0f) {
                    this.f6710t.g0(progress3 == 0.0f);
                }
                this.f6710t.setProgress(fMax);
                interfaceC1983f.mo5403f(1000);
                this.f6710t.t0 = this.f6703m != 0.0f ? interfaceC1983f.mo5402e() / this.f6706p[0] : interfaceC1983f.mo5401d() / this.f6706p[1];
            } else {
                this.f6710t.t0 = 0.0f;
            }
            this.f6708r = motionEvent.getRawX();
            this.f6709s = motionEvent.getRawY();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b6  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m5522t(MotionEvent motionEvent, MotionLayout.InterfaceC1983f interfaceC1983f, int i, C1988a c1988a) throws Resources.NotFoundException {
        float left;
        float f;
        int top;
        int bottom;
        int i2;
        float f2;
        int i3;
        interfaceC1983f.mo5400c(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6708r = motionEvent.getRawX();
            this.f6709s = motionEvent.getRawY();
            this.f6705o = false;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            motionEvent.getRawY();
            motionEvent.getRawX();
            float width = this.f6710t.getWidth() / 2.0f;
            float height = this.f6710t.getHeight() / 2.0f;
            int i4 = this.f6701k;
            if (i4 != -1) {
                View viewFindViewById = this.f6710t.findViewById(i4);
                this.f6710t.getLocationOnScreen(this.f6707q);
                height = ((viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f) + this.f6707q[1];
                width = this.f6707q[0] + ((viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f);
            } else {
                int i5 = this.f6694d;
                if (i5 != -1) {
                    if (this.f6710t.findViewById(this.f6710t.p0(i5).m29071h()) != null) {
                        this.f6710t.getLocationOnScreen(this.f6707q);
                        width = this.f6707q[0] + ((r12.getLeft() + r12.getRight()) / 2.0f);
                        height = this.f6707q[1] + ((r12.getTop() + r12.getBottom()) / 2.0f);
                    }
                }
            }
            float rawX = motionEvent.getRawX() - width;
            float rawY = motionEvent.getRawY() - height;
            float fAtan2 = (float) (((Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width) - Math.atan2(this.f6709s - height, this.f6708r - width)) * 180.0d) / 3.141592653589793d);
            if (fAtan2 > 330.0f) {
                fAtan2 -= 360.0f;
            } else if (fAtan2 < -330.0f) {
                fAtan2 += 360.0f;
            }
            if (Math.abs(fAtan2) > 0.01d || this.f6705o) {
                float progress = this.f6710t.getProgress();
                if (!this.f6705o) {
                    this.f6705o = true;
                    this.f6710t.setProgress(progress);
                }
                int i6 = this.f6694d;
                if (i6 != -1) {
                    this.f6710t.n0(i6, progress, this.f6698h, this.f6697g, this.f6706p);
                    this.f6706p[1] = (float) Math.toDegrees(r3[1]);
                } else {
                    this.f6706p[1] = 360.0f;
                }
                float fMax = Math.max(Math.min(progress + ((fAtan2 * this.f6714x) / this.f6706p[1]), 1.0f), 0.0f);
                float progress2 = this.f6710t.getProgress();
                if (fMax != progress2) {
                    if (progress2 == 0.0f || progress2 == 1.0f) {
                        this.f6710t.g0(progress2 == 0.0f);
                    }
                    this.f6710t.setProgress(fMax);
                    interfaceC1983f.mo5403f(1000);
                    float fMo5402e = interfaceC1983f.mo5402e();
                    double dMo5401d = interfaceC1983f.mo5401d();
                    double d = fMo5402e;
                    this.f6710t.t0 = (float) Math.toDegrees((float) ((Math.hypot(dMo5401d, d) * Math.sin(Math.atan2(dMo5401d, d) - r8)) / Math.hypot(rawX, rawY)));
                } else {
                    this.f6710t.t0 = 0.0f;
                }
                this.f6708r = motionEvent.getRawX();
                this.f6709s = motionEvent.getRawY();
                return;
            }
            return;
        }
        this.f6705o = false;
        interfaceC1983f.mo5403f(16);
        float fMo5402e2 = interfaceC1983f.mo5402e();
        float fMo5401d = interfaceC1983f.mo5401d();
        float progress3 = this.f6710t.getProgress();
        float width2 = this.f6710t.getWidth() / 2.0f;
        float height2 = this.f6710t.getHeight() / 2.0f;
        int i7 = this.f6701k;
        if (i7 == -1) {
            int i8 = this.f6694d;
            if (i8 != -1) {
                View viewFindViewById2 = this.f6710t.findViewById(this.f6710t.p0(i8).m29071h());
                this.f6710t.getLocationOnScreen(this.f6707q);
                left = this.f6707q[0] + ((viewFindViewById2.getLeft() + viewFindViewById2.getRight()) / 2.0f);
                f = this.f6707q[1];
                top = viewFindViewById2.getTop();
                bottom = viewFindViewById2.getBottom();
            }
            float rawX2 = motionEvent.getRawX() - width2;
            double degrees = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX2));
            i2 = this.f6694d;
            if (i2 == -1) {
                this.f6710t.n0(i2, progress3, this.f6698h, this.f6697g, this.f6706p);
                this.f6706p[1] = (float) Math.toDegrees(r3[1]);
            } else {
                this.f6706p[1] = 360.0f;
            }
            float degrees2 = ((float) (Math.toDegrees(Math.atan2(fMo5401d + r2, fMo5402e2 + rawX2)) - degrees)) * 62.5f;
            f2 = Float.isNaN(degrees2) ? (((degrees2 * 3.0f) * this.f6714x) / this.f6706p[1]) + progress3 : progress3;
            if (f2 != 0.0f || f2 == 1.0f || (i3 = this.f6693c) == 3) {
                if (0.0f < f2 || 1.0f <= f2) {
                    this.f6710t.setState(MotionLayout.EnumC1987j.FINISHED);
                }
                return;
            }
            float fAbs = (degrees2 * this.f6714x) / this.f6706p[1];
            float f3 = ((double) f2) < 0.5d ? 0.0f : 1.0f;
            if (i3 == 6) {
                if (progress3 + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f3 = 1.0f;
            }
            if (this.f6693c == 7) {
                if (progress3 + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f3 = 0.0f;
            }
            this.f6710t.B0(this.f6693c, f3, fAbs * 3.0f);
            if (0.0f >= progress3 || 1.0f <= progress3) {
                this.f6710t.setState(MotionLayout.EnumC1987j.FINISHED);
                return;
            }
            return;
        }
        View viewFindViewById3 = this.f6710t.findViewById(i7);
        this.f6710t.getLocationOnScreen(this.f6707q);
        left = this.f6707q[0] + ((viewFindViewById3.getLeft() + viewFindViewById3.getRight()) / 2.0f);
        f = this.f6707q[1];
        top = viewFindViewById3.getTop();
        bottom = viewFindViewById3.getBottom();
        height2 = f + ((top + bottom) / 2.0f);
        width2 = left;
        float rawX22 = motionEvent.getRawX() - width2;
        double degrees3 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX22));
        i2 = this.f6694d;
        if (i2 == -1) {
        }
        float degrees22 = ((float) (Math.toDegrees(Math.atan2(fMo5401d + r2, fMo5402e2 + rawX22)) - degrees3)) * 62.5f;
        if (Float.isNaN(degrees22)) {
        }
        if (f2 != 0.0f) {
        }
        if (0.0f < f2) {
        }
        this.f6710t.setState(MotionLayout.EnumC1987j.FINISHED);
    }

    public String toString() {
        if (Float.isNaN(this.f6703m)) {
            return "rotation";
        }
        return this.f6703m + " , " + this.f6704n;
    }

    /* renamed from: u */
    public void m5523u(float f, float f2) throws Resources.NotFoundException {
        float progress = this.f6710t.getProgress();
        if (!this.f6705o) {
            this.f6705o = true;
            this.f6710t.setProgress(progress);
        }
        this.f6710t.n0(this.f6694d, progress, this.f6698h, this.f6697g, this.f6706p);
        float f3 = this.f6703m;
        float[] fArr = this.f6706p;
        if (Math.abs((f3 * fArr[0]) + (this.f6704n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f6706p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f4 = this.f6703m;
        float fMax = Math.max(Math.min(progress + (f4 != 0.0f ? (f * f4) / this.f6706p[0] : (f2 * this.f6704n) / this.f6706p[1]), 1.0f), 0.0f);
        if (fMax != this.f6710t.getProgress()) {
            this.f6710t.setProgress(fMax);
        }
    }

    /* renamed from: v */
    public void m5524v(float f, float f2) throws Resources.NotFoundException {
        int i;
        this.f6705o = false;
        float progress = this.f6710t.getProgress();
        this.f6710t.n0(this.f6694d, progress, this.f6698h, this.f6697g, this.f6706p);
        float f3 = this.f6703m;
        float[] fArr = this.f6706p;
        float f4 = f3 != 0.0f ? (f * f3) / fArr[0] : (f2 * this.f6704n) / fArr[1];
        if (!Float.isNaN(f4)) {
            progress += f4 / 3.0f;
        }
        if (progress == 0.0f || progress == 1.0f || (i = this.f6693c) == 3) {
            return;
        }
        this.f6710t.B0(i, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f4);
    }

    /* renamed from: w */
    public void m5525w(float f, float f2) {
        this.f6708r = f;
        this.f6709s = f2;
    }

    /* renamed from: x */
    public void m5526x(boolean z) {
        if (z) {
            float[][] fArr = f6684H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f6683G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f6684H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f6683G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f6683G[this.f6691a];
        this.f6698h = fArr5[0];
        this.f6697g = fArr5[1];
        int i = this.f6692b;
        float[][] fArr6 = f6684H;
        if (i >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i];
        this.f6703m = fArr7[0];
        this.f6704n = fArr7[1];
    }

    /* renamed from: y */
    public void m5527y(int i) {
        this.f6693c = i;
    }

    /* renamed from: z */
    public void m5528z(float f, float f2) {
        this.f6708r = f;
        this.f6709s = f2;
        this.f6705o = false;
    }
}
