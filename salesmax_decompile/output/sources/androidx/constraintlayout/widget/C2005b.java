package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.google.api.Service;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import org.objectweb.asm.signature.SignatureVisitor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p001o.dy7;
import p001o.k75;
import p001o.mbe;
import p001o.q26;
import p001o.t8e;
import p001o.um5;
import p001o.wm5;
import p001o.zt3;

/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes2.dex */
public class C2005b {

    /* renamed from: i */
    public static final int[] f6956i = {0, 4, 8};

    /* renamed from: j */
    public static SparseIntArray f6957j = new SparseIntArray();

    /* renamed from: k */
    public static SparseIntArray f6958k = new SparseIntArray();

    /* renamed from: a */
    public boolean f6959a;

    /* renamed from: b */
    public String f6960b;

    /* renamed from: c */
    public String f6961c = "";

    /* renamed from: d */
    public String[] f6962d = new String[0];

    /* renamed from: e */
    public int f6963e = 0;

    /* renamed from: f */
    public HashMap f6964f = new HashMap();

    /* renamed from: g */
    public boolean f6965g = true;

    /* renamed from: h */
    public HashMap f6966h = new HashMap();

    /* renamed from: androidx.constraintlayout.widget.b$a */
    public static class a {

        /* renamed from: a */
        public int f6967a;

        /* renamed from: b */
        public String f6968b;

        /* renamed from: c */
        public final d f6969c = new d();

        /* renamed from: d */
        public final c f6970d = new c();

        /* renamed from: e */
        public final b f6971e = new b();

        /* renamed from: f */
        public final e f6972f = new e();

        /* renamed from: g */
        public HashMap f6973g = new HashMap();

        /* renamed from: h */
        public C19557a f6974h;

        /* renamed from: androidx.constraintlayout.widget.b$a$a, reason: collision with other inner class name */
        public static class C19557a {

            /* renamed from: a */
            public int[] f6975a = new int[10];

            /* renamed from: b */
            public int[] f6976b = new int[10];

            /* renamed from: c */
            public int f6977c = 0;

            /* renamed from: d */
            public int[] f6978d = new int[10];

            /* renamed from: e */
            public float[] f6979e = new float[10];

            /* renamed from: f */
            public int f6980f = 0;

            /* renamed from: g */
            public int[] f6981g = new int[5];

            /* renamed from: h */
            public String[] f6982h = new String[5];

            /* renamed from: i */
            public int f6983i = 0;

            /* renamed from: j */
            public int[] f6984j = new int[4];

            /* renamed from: k */
            public boolean[] f6985k = new boolean[4];

            /* renamed from: l */
            public int f6986l = 0;

            /* renamed from: a */
            public void m5703a(int i, float f) {
                int i2 = this.f6980f;
                int[] iArr = this.f6978d;
                if (i2 >= iArr.length) {
                    this.f6978d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f6979e;
                    this.f6979e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f6978d;
                int i3 = this.f6980f;
                iArr2[i3] = i;
                float[] fArr2 = this.f6979e;
                this.f6980f = i3 + 1;
                fArr2[i3] = f;
            }

            /* renamed from: b */
            public void m5704b(int i, int i2) {
                int i3 = this.f6977c;
                int[] iArr = this.f6975a;
                if (i3 >= iArr.length) {
                    this.f6975a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f6976b;
                    this.f6976b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f6975a;
                int i4 = this.f6977c;
                iArr3[i4] = i;
                int[] iArr4 = this.f6976b;
                this.f6977c = i4 + 1;
                iArr4[i4] = i2;
            }

            /* renamed from: c */
            public void m5705c(int i, String str) {
                int i2 = this.f6983i;
                int[] iArr = this.f6981g;
                if (i2 >= iArr.length) {
                    this.f6981g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f6982h;
                    this.f6982h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f6981g;
                int i3 = this.f6983i;
                iArr2[i3] = i;
                String[] strArr2 = this.f6982h;
                this.f6983i = i3 + 1;
                strArr2[i3] = str;
            }

            /* renamed from: d */
            public void m5706d(int i, boolean z) {
                int i2 = this.f6986l;
                int[] iArr = this.f6984j;
                if (i2 >= iArr.length) {
                    this.f6984j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f6985k;
                    this.f6985k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f6984j;
                int i3 = this.f6986l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f6985k;
                this.f6986l = i3 + 1;
                zArr2[i3] = z;
            }

            /* renamed from: e */
            public void m5707e(a aVar) {
                for (int i = 0; i < this.f6977c; i++) {
                    C2005b.m5653O(aVar, this.f6975a[i], this.f6976b[i]);
                }
                for (int i2 = 0; i2 < this.f6980f; i2++) {
                    C2005b.m5652N(aVar, this.f6978d[i2], this.f6979e[i2]);
                }
                for (int i3 = 0; i3 < this.f6983i; i3++) {
                    C2005b.m5654P(aVar, this.f6981g[i3], this.f6982h[i3]);
                }
                for (int i4 = 0; i4 < this.f6986l; i4++) {
                    C2005b.m5655Q(aVar, this.f6984j[i4], this.f6985k[i4]);
                }
            }
        }

        /* renamed from: d */
        public void m5697d(a aVar) {
            C19557a c19557a = this.f6974h;
            if (c19557a != null) {
                c19557a.m5707e(aVar);
            }
        }

        /* renamed from: e */
        public void m5698e(ConstraintLayout.LayoutParams layoutParams) {
            b bVar = this.f6971e;
            layoutParams.f6905e = bVar.f7022j;
            layoutParams.f6906f = bVar.f7023k;
            layoutParams.f6907g = bVar.f7024l;
            layoutParams.f6908h = bVar.f7025m;
            layoutParams.f6909i = bVar.f7026n;
            layoutParams.f6910j = bVar.f7027o;
            layoutParams.f6911k = bVar.f7028p;
            layoutParams.f6912l = bVar.f7029q;
            layoutParams.f6913m = bVar.f7030r;
            layoutParams.f6914n = bVar.f7031s;
            layoutParams.f6915o = bVar.f7032t;
            layoutParams.f6919s = bVar.f7033u;
            layoutParams.f6920t = bVar.f7034v;
            layoutParams.f6921u = bVar.f7035w;
            layoutParams.f6922v = bVar.f7036x;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bVar.f6994H;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bVar.f6995I;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.f6996J;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bVar.f6997K;
            layoutParams.f6875A = bVar.f7006T;
            layoutParams.f6876B = bVar.f7005S;
            layoutParams.f6924x = bVar.f7002P;
            layoutParams.f6926z = bVar.f7004R;
            layoutParams.f6881G = bVar.f7037y;
            layoutParams.f6882H = bVar.f7038z;
            layoutParams.f6916p = bVar.f6988B;
            layoutParams.f6917q = bVar.f6989C;
            layoutParams.f6918r = bVar.f6990D;
            layoutParams.f6883I = bVar.f6987A;
            layoutParams.f6898X = bVar.f6991E;
            layoutParams.f6899Y = bVar.f6992F;
            layoutParams.f6887M = bVar.f7008V;
            layoutParams.f6886L = bVar.f7009W;
            layoutParams.f6889O = bVar.f7011Y;
            layoutParams.f6888N = bVar.f7010X;
            layoutParams.a0 = bVar.n0;
            layoutParams.b0 = bVar.o0;
            layoutParams.f6890P = bVar.f7012Z;
            layoutParams.f6891Q = bVar.a0;
            layoutParams.f6894T = bVar.b0;
            layoutParams.f6895U = bVar.c0;
            layoutParams.f6892R = bVar.d0;
            layoutParams.f6893S = bVar.e0;
            layoutParams.f6896V = bVar.f0;
            layoutParams.f6897W = bVar.g0;
            layoutParams.f6900Z = bVar.f6993G;
            layoutParams.f6903c = bVar.f7020h;
            layoutParams.f6901a = bVar.f7018f;
            layoutParams.f6902b = bVar.f7019g;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = bVar.f7016d;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = bVar.f7017e;
            String str = bVar.m0;
            if (str != null) {
                layoutParams.c0 = str;
            }
            layoutParams.d0 = bVar.q0;
            layoutParams.setMarginStart(bVar.f6999M);
            layoutParams.setMarginEnd(this.f6971e.f6998L);
            layoutParams.m5624c();
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f6971e.m5708a(this.f6971e);
            aVar.f6970d.m5710a(this.f6970d);
            aVar.f6969c.m5712a(this.f6969c);
            aVar.f6972f.m5714a(this.f6972f);
            aVar.f6967a = this.f6967a;
            aVar.f6974h = this.f6974h;
            return aVar;
        }

        /* renamed from: g */
        public final void m5700g(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f6967a = i;
            b bVar = this.f6971e;
            bVar.f7022j = layoutParams.f6905e;
            bVar.f7023k = layoutParams.f6906f;
            bVar.f7024l = layoutParams.f6907g;
            bVar.f7025m = layoutParams.f6908h;
            bVar.f7026n = layoutParams.f6909i;
            bVar.f7027o = layoutParams.f6910j;
            bVar.f7028p = layoutParams.f6911k;
            bVar.f7029q = layoutParams.f6912l;
            bVar.f7030r = layoutParams.f6913m;
            bVar.f7031s = layoutParams.f6914n;
            bVar.f7032t = layoutParams.f6915o;
            bVar.f7033u = layoutParams.f6919s;
            bVar.f7034v = layoutParams.f6920t;
            bVar.f7035w = layoutParams.f6921u;
            bVar.f7036x = layoutParams.f6922v;
            bVar.f7037y = layoutParams.f6881G;
            bVar.f7038z = layoutParams.f6882H;
            bVar.f6987A = layoutParams.f6883I;
            bVar.f6988B = layoutParams.f6916p;
            bVar.f6989C = layoutParams.f6917q;
            bVar.f6990D = layoutParams.f6918r;
            bVar.f6991E = layoutParams.f6898X;
            bVar.f6992F = layoutParams.f6899Y;
            bVar.f6993G = layoutParams.f6900Z;
            bVar.f7020h = layoutParams.f6903c;
            bVar.f7018f = layoutParams.f6901a;
            bVar.f7019g = layoutParams.f6902b;
            bVar.f7016d = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            bVar.f7017e = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            bVar.f6994H = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            bVar.f6995I = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            bVar.f6996J = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            bVar.f6997K = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            bVar.f7000N = layoutParams.f6878D;
            bVar.f7008V = layoutParams.f6887M;
            bVar.f7009W = layoutParams.f6886L;
            bVar.f7011Y = layoutParams.f6889O;
            bVar.f7010X = layoutParams.f6888N;
            bVar.n0 = layoutParams.a0;
            bVar.o0 = layoutParams.b0;
            bVar.f7012Z = layoutParams.f6890P;
            bVar.a0 = layoutParams.f6891Q;
            bVar.b0 = layoutParams.f6894T;
            bVar.c0 = layoutParams.f6895U;
            bVar.d0 = layoutParams.f6892R;
            bVar.e0 = layoutParams.f6893S;
            bVar.f0 = layoutParams.f6896V;
            bVar.g0 = layoutParams.f6897W;
            bVar.m0 = layoutParams.c0;
            bVar.f7002P = layoutParams.f6924x;
            bVar.f7004R = layoutParams.f6926z;
            bVar.f7001O = layoutParams.f6923w;
            bVar.f7003Q = layoutParams.f6925y;
            bVar.f7006T = layoutParams.f6875A;
            bVar.f7005S = layoutParams.f6876B;
            bVar.f7007U = layoutParams.f6877C;
            bVar.q0 = layoutParams.d0;
            bVar.f6998L = layoutParams.getMarginEnd();
            this.f6971e.f6999M = layoutParams.getMarginStart();
        }

        /* renamed from: h */
        public final void m5701h(int i, Constraints.LayoutParams layoutParams) {
            m5700g(i, layoutParams);
            this.f6969c.f7057d = layoutParams.x0;
            e eVar = this.f6972f;
            eVar.f7061b = layoutParams.A0;
            eVar.f7062c = layoutParams.B0;
            eVar.f7063d = layoutParams.C0;
            eVar.f7064e = layoutParams.D0;
            eVar.f7065f = layoutParams.E0;
            eVar.f7066g = layoutParams.F0;
            eVar.f7067h = layoutParams.G0;
            eVar.f7069j = layoutParams.H0;
            eVar.f7070k = layoutParams.I0;
            eVar.f7071l = layoutParams.J0;
            eVar.f7073n = layoutParams.z0;
            eVar.f7072m = layoutParams.y0;
        }

        /* renamed from: i */
        public final void m5702i(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            m5701h(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.f6971e;
                bVar.j0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.h0 = barrier.getType();
                this.f6971e.k0 = barrier.getReferencedIds();
                this.f6971e.i0 = barrier.getMargin();
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    public static class b {
        public static SparseIntArray r0;

        /* renamed from: d */
        public int f7016d;

        /* renamed from: e */
        public int f7017e;
        public int[] k0;
        public String l0;
        public String m0;

        /* renamed from: a */
        public boolean f7013a = false;

        /* renamed from: b */
        public boolean f7014b = false;

        /* renamed from: c */
        public boolean f7015c = false;

        /* renamed from: f */
        public int f7018f = -1;

        /* renamed from: g */
        public int f7019g = -1;

        /* renamed from: h */
        public float f7020h = -1.0f;

        /* renamed from: i */
        public boolean f7021i = true;

        /* renamed from: j */
        public int f7022j = -1;

        /* renamed from: k */
        public int f7023k = -1;

        /* renamed from: l */
        public int f7024l = -1;

        /* renamed from: m */
        public int f7025m = -1;

        /* renamed from: n */
        public int f7026n = -1;

        /* renamed from: o */
        public int f7027o = -1;

        /* renamed from: p */
        public int f7028p = -1;

        /* renamed from: q */
        public int f7029q = -1;

        /* renamed from: r */
        public int f7030r = -1;

        /* renamed from: s */
        public int f7031s = -1;

        /* renamed from: t */
        public int f7032t = -1;

        /* renamed from: u */
        public int f7033u = -1;

        /* renamed from: v */
        public int f7034v = -1;

        /* renamed from: w */
        public int f7035w = -1;

        /* renamed from: x */
        public int f7036x = -1;

        /* renamed from: y */
        public float f7037y = 0.5f;

        /* renamed from: z */
        public float f7038z = 0.5f;

        /* renamed from: A */
        public String f6987A = null;

        /* renamed from: B */
        public int f6988B = -1;

        /* renamed from: C */
        public int f6989C = 0;

        /* renamed from: D */
        public float f6990D = 0.0f;

        /* renamed from: E */
        public int f6991E = -1;

        /* renamed from: F */
        public int f6992F = -1;

        /* renamed from: G */
        public int f6993G = -1;

        /* renamed from: H */
        public int f6994H = 0;

        /* renamed from: I */
        public int f6995I = 0;

        /* renamed from: J */
        public int f6996J = 0;

        /* renamed from: K */
        public int f6997K = 0;

        /* renamed from: L */
        public int f6998L = 0;

        /* renamed from: M */
        public int f6999M = 0;

        /* renamed from: N */
        public int f7000N = 0;

        /* renamed from: O */
        public int f7001O = Integer.MIN_VALUE;

        /* renamed from: P */
        public int f7002P = Integer.MIN_VALUE;

        /* renamed from: Q */
        public int f7003Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public int f7004R = Integer.MIN_VALUE;

        /* renamed from: S */
        public int f7005S = Integer.MIN_VALUE;

        /* renamed from: T */
        public int f7006T = Integer.MIN_VALUE;

        /* renamed from: U */
        public int f7007U = Integer.MIN_VALUE;

        /* renamed from: V */
        public float f7008V = -1.0f;

        /* renamed from: W */
        public float f7009W = -1.0f;

        /* renamed from: X */
        public int f7010X = 0;

        /* renamed from: Y */
        public int f7011Y = 0;

        /* renamed from: Z */
        public int f7012Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public int e0 = 0;
        public float f0 = 1.0f;
        public float g0 = 1.0f;
        public int h0 = -1;
        public int i0 = 0;
        public int j0 = -1;
        public boolean n0 = false;
        public boolean o0 = false;
        public boolean p0 = true;
        public int q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            r0 = sparseIntArray;
            sparseIntArray.append(mbe.Layout_layout_constraintLeft_toLeftOf, 24);
            r0.append(mbe.Layout_layout_constraintLeft_toRightOf, 25);
            r0.append(mbe.Layout_layout_constraintRight_toLeftOf, 28);
            r0.append(mbe.Layout_layout_constraintRight_toRightOf, 29);
            r0.append(mbe.Layout_layout_constraintTop_toTopOf, 35);
            r0.append(mbe.Layout_layout_constraintTop_toBottomOf, 34);
            r0.append(mbe.Layout_layout_constraintBottom_toTopOf, 4);
            r0.append(mbe.Layout_layout_constraintBottom_toBottomOf, 3);
            r0.append(mbe.Layout_layout_constraintBaseline_toBaselineOf, 1);
            r0.append(mbe.Layout_layout_editor_absoluteX, 6);
            r0.append(mbe.Layout_layout_editor_absoluteY, 7);
            r0.append(mbe.Layout_layout_constraintGuide_begin, 17);
            r0.append(mbe.Layout_layout_constraintGuide_end, 18);
            r0.append(mbe.Layout_layout_constraintGuide_percent, 19);
            r0.append(mbe.Layout_guidelineUseRtl, 90);
            r0.append(mbe.Layout_android_orientation, 26);
            r0.append(mbe.Layout_layout_constraintStart_toEndOf, 31);
            r0.append(mbe.Layout_layout_constraintStart_toStartOf, 32);
            r0.append(mbe.Layout_layout_constraintEnd_toStartOf, 10);
            r0.append(mbe.Layout_layout_constraintEnd_toEndOf, 9);
            r0.append(mbe.Layout_layout_goneMarginLeft, 13);
            r0.append(mbe.Layout_layout_goneMarginTop, 16);
            r0.append(mbe.Layout_layout_goneMarginRight, 14);
            r0.append(mbe.Layout_layout_goneMarginBottom, 11);
            r0.append(mbe.Layout_layout_goneMarginStart, 15);
            r0.append(mbe.Layout_layout_goneMarginEnd, 12);
            r0.append(mbe.Layout_layout_constraintVertical_weight, 38);
            r0.append(mbe.Layout_layout_constraintHorizontal_weight, 37);
            r0.append(mbe.Layout_layout_constraintHorizontal_chainStyle, 39);
            r0.append(mbe.Layout_layout_constraintVertical_chainStyle, 40);
            r0.append(mbe.Layout_layout_constraintHorizontal_bias, 20);
            r0.append(mbe.Layout_layout_constraintVertical_bias, 36);
            r0.append(mbe.Layout_layout_constraintDimensionRatio, 5);
            r0.append(mbe.Layout_layout_constraintLeft_creator, 91);
            r0.append(mbe.Layout_layout_constraintTop_creator, 91);
            r0.append(mbe.Layout_layout_constraintRight_creator, 91);
            r0.append(mbe.Layout_layout_constraintBottom_creator, 91);
            r0.append(mbe.Layout_layout_constraintBaseline_creator, 91);
            r0.append(mbe.Layout_android_layout_marginLeft, 23);
            r0.append(mbe.Layout_android_layout_marginRight, 27);
            r0.append(mbe.Layout_android_layout_marginStart, 30);
            r0.append(mbe.Layout_android_layout_marginEnd, 8);
            r0.append(mbe.Layout_android_layout_marginTop, 33);
            r0.append(mbe.Layout_android_layout_marginBottom, 2);
            r0.append(mbe.Layout_android_layout_width, 22);
            r0.append(mbe.Layout_android_layout_height, 21);
            r0.append(mbe.Layout_layout_constraintWidth, 41);
            r0.append(mbe.Layout_layout_constraintHeight, 42);
            r0.append(mbe.Layout_layout_constrainedWidth, 87);
            r0.append(mbe.Layout_layout_constrainedHeight, 88);
            r0.append(mbe.Layout_layout_wrapBehaviorInParent, 76);
            r0.append(mbe.Layout_layout_constraintCircle, 61);
            r0.append(mbe.Layout_layout_constraintCircleRadius, 62);
            r0.append(mbe.Layout_layout_constraintCircleAngle, 63);
            r0.append(mbe.Layout_layout_constraintWidth_percent, 69);
            r0.append(mbe.Layout_layout_constraintHeight_percent, 70);
            r0.append(mbe.Layout_chainUseRtl, 71);
            r0.append(mbe.Layout_barrierDirection, 72);
            r0.append(mbe.Layout_barrierMargin, 73);
            r0.append(mbe.Layout_constraint_referenced_ids, 74);
            r0.append(mbe.Layout_barrierAllowsGoneWidgets, 75);
            r0.append(mbe.Layout_layout_constraintWidth_max, 84);
            r0.append(mbe.Layout_layout_constraintWidth_min, 86);
            r0.append(mbe.Layout_layout_constraintWidth_max, 83);
            r0.append(mbe.Layout_layout_constraintHeight_min, 85);
            r0.append(mbe.Layout_layout_constraintWidth, 87);
            r0.append(mbe.Layout_layout_constraintHeight, 88);
            r0.append(mbe.ConstraintLayout_Layout_layout_constraintTag, 89);
            r0.append(mbe.Layout_guidelineUseRtl, 90);
        }

        /* renamed from: a */
        public void m5708a(b bVar) {
            this.f7013a = bVar.f7013a;
            this.f7016d = bVar.f7016d;
            this.f7014b = bVar.f7014b;
            this.f7017e = bVar.f7017e;
            this.f7018f = bVar.f7018f;
            this.f7019g = bVar.f7019g;
            this.f7020h = bVar.f7020h;
            this.f7021i = bVar.f7021i;
            this.f7022j = bVar.f7022j;
            this.f7023k = bVar.f7023k;
            this.f7024l = bVar.f7024l;
            this.f7025m = bVar.f7025m;
            this.f7026n = bVar.f7026n;
            this.f7027o = bVar.f7027o;
            this.f7028p = bVar.f7028p;
            this.f7029q = bVar.f7029q;
            this.f7030r = bVar.f7030r;
            this.f7031s = bVar.f7031s;
            this.f7032t = bVar.f7032t;
            this.f7033u = bVar.f7033u;
            this.f7034v = bVar.f7034v;
            this.f7035w = bVar.f7035w;
            this.f7036x = bVar.f7036x;
            this.f7037y = bVar.f7037y;
            this.f7038z = bVar.f7038z;
            this.f6987A = bVar.f6987A;
            this.f6988B = bVar.f6988B;
            this.f6989C = bVar.f6989C;
            this.f6990D = bVar.f6990D;
            this.f6991E = bVar.f6991E;
            this.f6992F = bVar.f6992F;
            this.f6993G = bVar.f6993G;
            this.f6994H = bVar.f6994H;
            this.f6995I = bVar.f6995I;
            this.f6996J = bVar.f6996J;
            this.f6997K = bVar.f6997K;
            this.f6998L = bVar.f6998L;
            this.f6999M = bVar.f6999M;
            this.f7000N = bVar.f7000N;
            this.f7001O = bVar.f7001O;
            this.f7002P = bVar.f7002P;
            this.f7003Q = bVar.f7003Q;
            this.f7004R = bVar.f7004R;
            this.f7005S = bVar.f7005S;
            this.f7006T = bVar.f7006T;
            this.f7007U = bVar.f7007U;
            this.f7008V = bVar.f7008V;
            this.f7009W = bVar.f7009W;
            this.f7010X = bVar.f7010X;
            this.f7011Y = bVar.f7011Y;
            this.f7012Z = bVar.f7012Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
            this.m0 = bVar.m0;
            int[] iArr = bVar.k0;
            if (iArr == null || bVar.l0 != null) {
                this.k0 = null;
            } else {
                this.k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.l0 = bVar.l0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
            this.q0 = bVar.q0;
        }

        /* renamed from: b */
        public void m5709b(Context context, AttributeSet attributeSet) throws NumberFormatException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.Layout);
            this.f7014b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = r0.get(index);
                switch (i2) {
                    case 1:
                        this.f7030r = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7030r);
                        break;
                    case 2:
                        this.f6997K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6997K);
                        break;
                    case 3:
                        this.f7029q = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7029q);
                        break;
                    case 4:
                        this.f7028p = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7028p);
                        break;
                    case 5:
                        this.f6987A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f6991E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6991E);
                        break;
                    case 7:
                        this.f6992F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6992F);
                        break;
                    case 8:
                        this.f6998L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6998L);
                        break;
                    case 9:
                        this.f7036x = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7036x);
                        break;
                    case 10:
                        this.f7035w = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7035w);
                        break;
                    case 11:
                        this.f7004R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7004R);
                        break;
                    case 12:
                        this.f7005S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7005S);
                        break;
                    case 13:
                        this.f7001O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7001O);
                        break;
                    case 14:
                        this.f7003Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7003Q);
                        break;
                    case 15:
                        this.f7006T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7006T);
                        break;
                    case 16:
                        this.f7002P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7002P);
                        break;
                    case 17:
                        this.f7018f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7018f);
                        break;
                    case 18:
                        this.f7019g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7019g);
                        break;
                    case 19:
                        this.f7020h = typedArrayObtainStyledAttributes.getFloat(index, this.f7020h);
                        break;
                    case 20:
                        this.f7037y = typedArrayObtainStyledAttributes.getFloat(index, this.f7037y);
                        break;
                    case 21:
                        this.f7017e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f7017e);
                        break;
                    case 22:
                        this.f7016d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f7016d);
                        break;
                    case 23:
                        this.f6994H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6994H);
                        break;
                    case 24:
                        this.f7022j = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7022j);
                        break;
                    case 25:
                        this.f7023k = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7023k);
                        break;
                    case 26:
                        this.f6993G = typedArrayObtainStyledAttributes.getInt(index, this.f6993G);
                        break;
                    case 27:
                        this.f6995I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6995I);
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        this.f7024l = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7024l);
                        break;
                    case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                        this.f7025m = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7025m);
                        break;
                    case 30:
                        this.f6999M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6999M);
                        break;
                    case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        this.f7033u = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7033u);
                        break;
                    case 32:
                        this.f7034v = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7034v);
                        break;
                    case 33:
                        this.f6996J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6996J);
                        break;
                    case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        this.f7027o = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7027o);
                        break;
                    case 35:
                        this.f7026n = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7026n);
                        break;
                    case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        this.f7038z = typedArrayObtainStyledAttributes.getFloat(index, this.f7038z);
                        break;
                    case 37:
                        this.f7009W = typedArrayObtainStyledAttributes.getFloat(index, this.f7009W);
                        break;
                    case 38:
                        this.f7008V = typedArrayObtainStyledAttributes.getFloat(index, this.f7008V);
                        break;
                    case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        this.f7010X = typedArrayObtainStyledAttributes.getInt(index, this.f7010X);
                        break;
                    case 40:
                        this.f7011Y = typedArrayObtainStyledAttributes.getInt(index, this.f7011Y);
                        break;
                    case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        C2005b.m5648G(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        C2005b.m5648G(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.f6988B = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f6988B);
                                break;
                            case 62:
                                this.f6989C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6989C);
                                break;
                            case 63:
                                this.f6990D = typedArrayObtainStyledAttributes.getFloat(index, this.f6990D);
                                break;
                            default:
                                switch (i2) {
                                    case TypeReference.CONSTRUCTOR_REFERENCE /* 69 */:
                                        this.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case TypeReference.METHOD_REFERENCE /* 70 */:
                                        this.g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case TypeReference.CAST /* 71 */:
                                        break;
                                    case TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
                                        this.h0 = typedArrayObtainStyledAttributes.getInt(index, this.h0);
                                        break;
                                    case TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT /* 73 */:
                                        this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.i0);
                                        break;
                                    case TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT /* 74 */:
                                        this.l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT /* 75 */:
                                        this.p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.p0);
                                        break;
                                    case 76:
                                        this.q0 = typedArrayObtainStyledAttributes.getInt(index, this.q0);
                                        break;
                                    case 77:
                                        this.f7031s = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7031s);
                                        break;
                                    case 78:
                                        this.f7032t = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7032t);
                                        break;
                                    case Opcodes.IASTORE /* 79 */:
                                        this.f7007U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7007U);
                                        break;
                                    case 80:
                                        this.f7000N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7000N);
                                        break;
                                    case Opcodes.FASTORE /* 81 */:
                                        this.f7012Z = typedArrayObtainStyledAttributes.getInt(index, this.f7012Z);
                                        break;
                                    case Opcodes.DASTORE /* 82 */:
                                        this.a0 = typedArrayObtainStyledAttributes.getInt(index, this.a0);
                                        break;
                                    case Opcodes.AASTORE /* 83 */:
                                        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case Opcodes.BASTORE /* 84 */:
                                        this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case Opcodes.CASTORE /* 85 */:
                                        this.e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.e0);
                                        break;
                                    case 86:
                                        this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        break;
                                    case Opcodes.POP /* 87 */:
                                        this.n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case Opcodes.POP2 /* 88 */:
                                        this.o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.o0);
                                        break;
                                    case Opcodes.DUP /* 89 */:
                                        this.m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case Opcodes.DUP_X1 /* 90 */:
                                        this.f7021i = typedArrayObtainStyledAttributes.getBoolean(index, this.f7021i);
                                        break;
                                    case Opcodes.DUP_X2 /* 91 */:
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("unused attribute 0x");
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(r0.get(index));
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Unknown attribute 0x");
                                        sb2.append(Integer.toHexString(index));
                                        sb2.append("   ");
                                        sb2.append(r0.get(index));
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$c */
    public static class c {

        /* renamed from: o */
        public static SparseIntArray f7039o;

        /* renamed from: a */
        public boolean f7040a = false;

        /* renamed from: b */
        public int f7041b = -1;

        /* renamed from: c */
        public int f7042c = 0;

        /* renamed from: d */
        public String f7043d = null;

        /* renamed from: e */
        public int f7044e = -1;

        /* renamed from: f */
        public int f7045f = 0;

        /* renamed from: g */
        public float f7046g = Float.NaN;

        /* renamed from: h */
        public int f7047h = -1;

        /* renamed from: i */
        public float f7048i = Float.NaN;

        /* renamed from: j */
        public float f7049j = Float.NaN;

        /* renamed from: k */
        public int f7050k = -1;

        /* renamed from: l */
        public String f7051l = null;

        /* renamed from: m */
        public int f7052m = -3;

        /* renamed from: n */
        public int f7053n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7039o = sparseIntArray;
            sparseIntArray.append(mbe.Motion_motionPathRotate, 1);
            f7039o.append(mbe.Motion_pathMotionArc, 2);
            f7039o.append(mbe.Motion_transitionEasing, 3);
            f7039o.append(mbe.Motion_drawPath, 4);
            f7039o.append(mbe.Motion_animateRelativeTo, 5);
            f7039o.append(mbe.Motion_animateCircleAngleTo, 6);
            f7039o.append(mbe.Motion_motionStagger, 7);
            f7039o.append(mbe.Motion_quantizeMotionSteps, 8);
            f7039o.append(mbe.Motion_quantizeMotionPhase, 9);
            f7039o.append(mbe.Motion_quantizeMotionInterpolator, 10);
        }

        /* renamed from: a */
        public void m5710a(c cVar) {
            this.f7040a = cVar.f7040a;
            this.f7041b = cVar.f7041b;
            this.f7043d = cVar.f7043d;
            this.f7044e = cVar.f7044e;
            this.f7045f = cVar.f7045f;
            this.f7048i = cVar.f7048i;
            this.f7046g = cVar.f7046g;
            this.f7047h = cVar.f7047h;
        }

        /* renamed from: b */
        public void m5711b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.Motion);
            this.f7040a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f7039o.get(index)) {
                    case 1:
                        this.f7048i = typedArrayObtainStyledAttributes.getFloat(index, this.f7048i);
                        break;
                    case 2:
                        this.f7044e = typedArrayObtainStyledAttributes.getInt(index, this.f7044e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f7043d = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f7043d = q26.f41164c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f7045f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f7041b = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7041b);
                        break;
                    case 6:
                        this.f7042c = typedArrayObtainStyledAttributes.getInteger(index, this.f7042c);
                        break;
                    case 7:
                        this.f7046g = typedArrayObtainStyledAttributes.getFloat(index, this.f7046g);
                        break;
                    case 8:
                        this.f7050k = typedArrayObtainStyledAttributes.getInteger(index, this.f7050k);
                        break;
                    case 9:
                        this.f7049j = typedArrayObtainStyledAttributes.getFloat(index, this.f7049j);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f7053n = resourceId;
                            if (resourceId != -1) {
                                this.f7052m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f7051l = string;
                            if (string.indexOf("/") > 0) {
                                this.f7053n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f7052m = -2;
                                break;
                            } else {
                                this.f7052m = -1;
                                break;
                            }
                        } else {
                            this.f7052m = typedArrayObtainStyledAttributes.getInteger(index, this.f7053n);
                            break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$d */
    public static class d {

        /* renamed from: a */
        public boolean f7054a = false;

        /* renamed from: b */
        public int f7055b = 0;

        /* renamed from: c */
        public int f7056c = 0;

        /* renamed from: d */
        public float f7057d = 1.0f;

        /* renamed from: e */
        public float f7058e = Float.NaN;

        /* renamed from: a */
        public void m5712a(d dVar) {
            this.f7054a = dVar.f7054a;
            this.f7055b = dVar.f7055b;
            this.f7057d = dVar.f7057d;
            this.f7058e = dVar.f7058e;
            this.f7056c = dVar.f7056c;
        }

        /* renamed from: b */
        public void m5713b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.PropertySet);
            this.f7054a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.PropertySet_android_alpha) {
                    this.f7057d = typedArrayObtainStyledAttributes.getFloat(index, this.f7057d);
                } else if (index == mbe.PropertySet_android_visibility) {
                    this.f7055b = typedArrayObtainStyledAttributes.getInt(index, this.f7055b);
                    this.f7055b = C2005b.f6956i[this.f7055b];
                } else if (index == mbe.PropertySet_visibilityMode) {
                    this.f7056c = typedArrayObtainStyledAttributes.getInt(index, this.f7056c);
                } else if (index == mbe.PropertySet_motionProgress) {
                    this.f7058e = typedArrayObtainStyledAttributes.getFloat(index, this.f7058e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$e */
    public static class e {

        /* renamed from: o */
        public static SparseIntArray f7059o;

        /* renamed from: a */
        public boolean f7060a = false;

        /* renamed from: b */
        public float f7061b = 0.0f;

        /* renamed from: c */
        public float f7062c = 0.0f;

        /* renamed from: d */
        public float f7063d = 0.0f;

        /* renamed from: e */
        public float f7064e = 1.0f;

        /* renamed from: f */
        public float f7065f = 1.0f;

        /* renamed from: g */
        public float f7066g = Float.NaN;

        /* renamed from: h */
        public float f7067h = Float.NaN;

        /* renamed from: i */
        public int f7068i = -1;

        /* renamed from: j */
        public float f7069j = 0.0f;

        /* renamed from: k */
        public float f7070k = 0.0f;

        /* renamed from: l */
        public float f7071l = 0.0f;

        /* renamed from: m */
        public boolean f7072m = false;

        /* renamed from: n */
        public float f7073n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7059o = sparseIntArray;
            sparseIntArray.append(mbe.Transform_android_rotation, 1);
            f7059o.append(mbe.Transform_android_rotationX, 2);
            f7059o.append(mbe.Transform_android_rotationY, 3);
            f7059o.append(mbe.Transform_android_scaleX, 4);
            f7059o.append(mbe.Transform_android_scaleY, 5);
            f7059o.append(mbe.Transform_android_transformPivotX, 6);
            f7059o.append(mbe.Transform_android_transformPivotY, 7);
            f7059o.append(mbe.Transform_android_translationX, 8);
            f7059o.append(mbe.Transform_android_translationY, 9);
            f7059o.append(mbe.Transform_android_translationZ, 10);
            f7059o.append(mbe.Transform_android_elevation, 11);
            f7059o.append(mbe.Transform_transformPivotTarget, 12);
        }

        /* renamed from: a */
        public void m5714a(e eVar) {
            this.f7060a = eVar.f7060a;
            this.f7061b = eVar.f7061b;
            this.f7062c = eVar.f7062c;
            this.f7063d = eVar.f7063d;
            this.f7064e = eVar.f7064e;
            this.f7065f = eVar.f7065f;
            this.f7066g = eVar.f7066g;
            this.f7067h = eVar.f7067h;
            this.f7068i = eVar.f7068i;
            this.f7069j = eVar.f7069j;
            this.f7070k = eVar.f7070k;
            this.f7071l = eVar.f7071l;
            this.f7072m = eVar.f7072m;
            this.f7073n = eVar.f7073n;
        }

        /* renamed from: b */
        public void m5715b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.Transform);
            this.f7060a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f7059o.get(index)) {
                    case 1:
                        this.f7061b = typedArrayObtainStyledAttributes.getFloat(index, this.f7061b);
                        break;
                    case 2:
                        this.f7062c = typedArrayObtainStyledAttributes.getFloat(index, this.f7062c);
                        break;
                    case 3:
                        this.f7063d = typedArrayObtainStyledAttributes.getFloat(index, this.f7063d);
                        break;
                    case 4:
                        this.f7064e = typedArrayObtainStyledAttributes.getFloat(index, this.f7064e);
                        break;
                    case 5:
                        this.f7065f = typedArrayObtainStyledAttributes.getFloat(index, this.f7065f);
                        break;
                    case 6:
                        this.f7066g = typedArrayObtainStyledAttributes.getDimension(index, this.f7066g);
                        break;
                    case 7:
                        this.f7067h = typedArrayObtainStyledAttributes.getDimension(index, this.f7067h);
                        break;
                    case 8:
                        this.f7069j = typedArrayObtainStyledAttributes.getDimension(index, this.f7069j);
                        break;
                    case 9:
                        this.f7070k = typedArrayObtainStyledAttributes.getDimension(index, this.f7070k);
                        break;
                    case 10:
                        this.f7071l = typedArrayObtainStyledAttributes.getDimension(index, this.f7071l);
                        break;
                    case 11:
                        this.f7072m = true;
                        this.f7073n = typedArrayObtainStyledAttributes.getDimension(index, this.f7073n);
                        break;
                    case 12:
                        this.f7068i = C2005b.m5647F(typedArrayObtainStyledAttributes, index, this.f7068i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f6957j.append(mbe.Constraint_layout_constraintLeft_toLeftOf, 25);
        f6957j.append(mbe.Constraint_layout_constraintLeft_toRightOf, 26);
        f6957j.append(mbe.Constraint_layout_constraintRight_toLeftOf, 29);
        f6957j.append(mbe.Constraint_layout_constraintRight_toRightOf, 30);
        f6957j.append(mbe.Constraint_layout_constraintTop_toTopOf, 36);
        f6957j.append(mbe.Constraint_layout_constraintTop_toBottomOf, 35);
        f6957j.append(mbe.Constraint_layout_constraintBottom_toTopOf, 4);
        f6957j.append(mbe.Constraint_layout_constraintBottom_toBottomOf, 3);
        f6957j.append(mbe.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f6957j.append(mbe.Constraint_layout_constraintBaseline_toTopOf, 91);
        f6957j.append(mbe.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f6957j.append(mbe.Constraint_layout_editor_absoluteX, 6);
        f6957j.append(mbe.Constraint_layout_editor_absoluteY, 7);
        f6957j.append(mbe.Constraint_layout_constraintGuide_begin, 17);
        f6957j.append(mbe.Constraint_layout_constraintGuide_end, 18);
        f6957j.append(mbe.Constraint_layout_constraintGuide_percent, 19);
        f6957j.append(mbe.Constraint_guidelineUseRtl, 99);
        f6957j.append(mbe.Constraint_android_orientation, 27);
        f6957j.append(mbe.Constraint_layout_constraintStart_toEndOf, 32);
        f6957j.append(mbe.Constraint_layout_constraintStart_toStartOf, 33);
        f6957j.append(mbe.Constraint_layout_constraintEnd_toStartOf, 10);
        f6957j.append(mbe.Constraint_layout_constraintEnd_toEndOf, 9);
        f6957j.append(mbe.Constraint_layout_goneMarginLeft, 13);
        f6957j.append(mbe.Constraint_layout_goneMarginTop, 16);
        f6957j.append(mbe.Constraint_layout_goneMarginRight, 14);
        f6957j.append(mbe.Constraint_layout_goneMarginBottom, 11);
        f6957j.append(mbe.Constraint_layout_goneMarginStart, 15);
        f6957j.append(mbe.Constraint_layout_goneMarginEnd, 12);
        f6957j.append(mbe.Constraint_layout_constraintVertical_weight, 40);
        f6957j.append(mbe.Constraint_layout_constraintHorizontal_weight, 39);
        f6957j.append(mbe.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f6957j.append(mbe.Constraint_layout_constraintVertical_chainStyle, 42);
        f6957j.append(mbe.Constraint_layout_constraintHorizontal_bias, 20);
        f6957j.append(mbe.Constraint_layout_constraintVertical_bias, 37);
        f6957j.append(mbe.Constraint_layout_constraintDimensionRatio, 5);
        f6957j.append(mbe.Constraint_layout_constraintLeft_creator, 87);
        f6957j.append(mbe.Constraint_layout_constraintTop_creator, 87);
        f6957j.append(mbe.Constraint_layout_constraintRight_creator, 87);
        f6957j.append(mbe.Constraint_layout_constraintBottom_creator, 87);
        f6957j.append(mbe.Constraint_layout_constraintBaseline_creator, 87);
        f6957j.append(mbe.Constraint_android_layout_marginLeft, 24);
        f6957j.append(mbe.Constraint_android_layout_marginRight, 28);
        f6957j.append(mbe.Constraint_android_layout_marginStart, 31);
        f6957j.append(mbe.Constraint_android_layout_marginEnd, 8);
        f6957j.append(mbe.Constraint_android_layout_marginTop, 34);
        f6957j.append(mbe.Constraint_android_layout_marginBottom, 2);
        f6957j.append(mbe.Constraint_android_layout_width, 23);
        f6957j.append(mbe.Constraint_android_layout_height, 21);
        f6957j.append(mbe.Constraint_layout_constraintWidth, 95);
        f6957j.append(mbe.Constraint_layout_constraintHeight, 96);
        f6957j.append(mbe.Constraint_android_visibility, 22);
        f6957j.append(mbe.Constraint_android_alpha, 43);
        f6957j.append(mbe.Constraint_android_elevation, 44);
        f6957j.append(mbe.Constraint_android_rotationX, 45);
        f6957j.append(mbe.Constraint_android_rotationY, 46);
        f6957j.append(mbe.Constraint_android_rotation, 60);
        f6957j.append(mbe.Constraint_android_scaleX, 47);
        f6957j.append(mbe.Constraint_android_scaleY, 48);
        f6957j.append(mbe.Constraint_android_transformPivotX, 49);
        f6957j.append(mbe.Constraint_android_transformPivotY, 50);
        f6957j.append(mbe.Constraint_android_translationX, 51);
        f6957j.append(mbe.Constraint_android_translationY, 52);
        f6957j.append(mbe.Constraint_android_translationZ, 53);
        f6957j.append(mbe.Constraint_layout_constraintWidth_default, 54);
        f6957j.append(mbe.Constraint_layout_constraintHeight_default, 55);
        f6957j.append(mbe.Constraint_layout_constraintWidth_max, 56);
        f6957j.append(mbe.Constraint_layout_constraintHeight_max, 57);
        f6957j.append(mbe.Constraint_layout_constraintWidth_min, 58);
        f6957j.append(mbe.Constraint_layout_constraintHeight_min, 59);
        f6957j.append(mbe.Constraint_layout_constraintCircle, 61);
        f6957j.append(mbe.Constraint_layout_constraintCircleRadius, 62);
        f6957j.append(mbe.Constraint_layout_constraintCircleAngle, 63);
        f6957j.append(mbe.Constraint_animateRelativeTo, 64);
        f6957j.append(mbe.Constraint_transitionEasing, 65);
        f6957j.append(mbe.Constraint_drawPath, 66);
        f6957j.append(mbe.Constraint_transitionPathRotate, 67);
        f6957j.append(mbe.Constraint_motionStagger, 79);
        f6957j.append(mbe.Constraint_android_id, 38);
        f6957j.append(mbe.Constraint_motionProgress, 68);
        f6957j.append(mbe.Constraint_layout_constraintWidth_percent, 69);
        f6957j.append(mbe.Constraint_layout_constraintHeight_percent, 70);
        f6957j.append(mbe.Constraint_layout_wrapBehaviorInParent, 97);
        f6957j.append(mbe.Constraint_chainUseRtl, 71);
        f6957j.append(mbe.Constraint_barrierDirection, 72);
        f6957j.append(mbe.Constraint_barrierMargin, 73);
        f6957j.append(mbe.Constraint_constraint_referenced_ids, 74);
        f6957j.append(mbe.Constraint_barrierAllowsGoneWidgets, 75);
        f6957j.append(mbe.Constraint_pathMotionArc, 76);
        f6957j.append(mbe.Constraint_layout_constraintTag, 77);
        f6957j.append(mbe.Constraint_visibilityMode, 78);
        f6957j.append(mbe.Constraint_layout_constrainedWidth, 80);
        f6957j.append(mbe.Constraint_layout_constrainedHeight, 81);
        f6957j.append(mbe.Constraint_polarRelativeTo, 82);
        f6957j.append(mbe.Constraint_transformPivotTarget, 83);
        f6957j.append(mbe.Constraint_quantizeMotionSteps, 84);
        f6957j.append(mbe.Constraint_quantizeMotionPhase, 85);
        f6957j.append(mbe.Constraint_quantizeMotionInterpolator, 86);
        f6958k.append(mbe.ConstraintOverride_layout_editor_absoluteY, 6);
        f6958k.append(mbe.ConstraintOverride_layout_editor_absoluteY, 7);
        f6958k.append(mbe.ConstraintOverride_android_orientation, 27);
        f6958k.append(mbe.ConstraintOverride_layout_goneMarginLeft, 13);
        f6958k.append(mbe.ConstraintOverride_layout_goneMarginTop, 16);
        f6958k.append(mbe.ConstraintOverride_layout_goneMarginRight, 14);
        f6958k.append(mbe.ConstraintOverride_layout_goneMarginBottom, 11);
        f6958k.append(mbe.ConstraintOverride_layout_goneMarginStart, 15);
        f6958k.append(mbe.ConstraintOverride_layout_goneMarginEnd, 12);
        f6958k.append(mbe.ConstraintOverride_layout_constraintVertical_weight, 40);
        f6958k.append(mbe.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f6958k.append(mbe.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f6958k.append(mbe.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f6958k.append(mbe.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f6958k.append(mbe.ConstraintOverride_layout_constraintVertical_bias, 37);
        f6958k.append(mbe.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f6958k.append(mbe.ConstraintOverride_layout_constraintLeft_creator, 87);
        f6958k.append(mbe.ConstraintOverride_layout_constraintTop_creator, 87);
        f6958k.append(mbe.ConstraintOverride_layout_constraintRight_creator, 87);
        f6958k.append(mbe.ConstraintOverride_layout_constraintBottom_creator, 87);
        f6958k.append(mbe.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f6958k.append(mbe.ConstraintOverride_android_layout_marginLeft, 24);
        f6958k.append(mbe.ConstraintOverride_android_layout_marginRight, 28);
        f6958k.append(mbe.ConstraintOverride_android_layout_marginStart, 31);
        f6958k.append(mbe.ConstraintOverride_android_layout_marginEnd, 8);
        f6958k.append(mbe.ConstraintOverride_android_layout_marginTop, 34);
        f6958k.append(mbe.ConstraintOverride_android_layout_marginBottom, 2);
        f6958k.append(mbe.ConstraintOverride_android_layout_width, 23);
        f6958k.append(mbe.ConstraintOverride_android_layout_height, 21);
        f6958k.append(mbe.ConstraintOverride_layout_constraintWidth, 95);
        f6958k.append(mbe.ConstraintOverride_layout_constraintHeight, 96);
        f6958k.append(mbe.ConstraintOverride_android_visibility, 22);
        f6958k.append(mbe.ConstraintOverride_android_alpha, 43);
        f6958k.append(mbe.ConstraintOverride_android_elevation, 44);
        f6958k.append(mbe.ConstraintOverride_android_rotationX, 45);
        f6958k.append(mbe.ConstraintOverride_android_rotationY, 46);
        f6958k.append(mbe.ConstraintOverride_android_rotation, 60);
        f6958k.append(mbe.ConstraintOverride_android_scaleX, 47);
        f6958k.append(mbe.ConstraintOverride_android_scaleY, 48);
        f6958k.append(mbe.ConstraintOverride_android_transformPivotX, 49);
        f6958k.append(mbe.ConstraintOverride_android_transformPivotY, 50);
        f6958k.append(mbe.ConstraintOverride_android_translationX, 51);
        f6958k.append(mbe.ConstraintOverride_android_translationY, 52);
        f6958k.append(mbe.ConstraintOverride_android_translationZ, 53);
        f6958k.append(mbe.ConstraintOverride_layout_constraintWidth_default, 54);
        f6958k.append(mbe.ConstraintOverride_layout_constraintHeight_default, 55);
        f6958k.append(mbe.ConstraintOverride_layout_constraintWidth_max, 56);
        f6958k.append(mbe.ConstraintOverride_layout_constraintHeight_max, 57);
        f6958k.append(mbe.ConstraintOverride_layout_constraintWidth_min, 58);
        f6958k.append(mbe.ConstraintOverride_layout_constraintHeight_min, 59);
        f6958k.append(mbe.ConstraintOverride_layout_constraintCircleRadius, 62);
        f6958k.append(mbe.ConstraintOverride_layout_constraintCircleAngle, 63);
        f6958k.append(mbe.ConstraintOverride_animateRelativeTo, 64);
        f6958k.append(mbe.ConstraintOverride_transitionEasing, 65);
        f6958k.append(mbe.ConstraintOverride_drawPath, 66);
        f6958k.append(mbe.ConstraintOverride_transitionPathRotate, 67);
        f6958k.append(mbe.ConstraintOverride_motionStagger, 79);
        f6958k.append(mbe.ConstraintOverride_android_id, 38);
        f6958k.append(mbe.ConstraintOverride_motionTarget, 98);
        f6958k.append(mbe.ConstraintOverride_motionProgress, 68);
        f6958k.append(mbe.ConstraintOverride_layout_constraintWidth_percent, 69);
        f6958k.append(mbe.ConstraintOverride_layout_constraintHeight_percent, 70);
        f6958k.append(mbe.ConstraintOverride_chainUseRtl, 71);
        f6958k.append(mbe.ConstraintOverride_barrierDirection, 72);
        f6958k.append(mbe.ConstraintOverride_barrierMargin, 73);
        f6958k.append(mbe.ConstraintOverride_constraint_referenced_ids, 74);
        f6958k.append(mbe.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f6958k.append(mbe.ConstraintOverride_pathMotionArc, 76);
        f6958k.append(mbe.ConstraintOverride_layout_constraintTag, 77);
        f6958k.append(mbe.ConstraintOverride_visibilityMode, 78);
        f6958k.append(mbe.ConstraintOverride_layout_constrainedWidth, 80);
        f6958k.append(mbe.ConstraintOverride_layout_constrainedHeight, 81);
        f6958k.append(mbe.ConstraintOverride_polarRelativeTo, 82);
        f6958k.append(mbe.ConstraintOverride_transformPivotTarget, 83);
        f6958k.append(mbe.ConstraintOverride_quantizeMotionSteps, 84);
        f6958k.append(mbe.ConstraintOverride_quantizeMotionPhase, 85);
        f6958k.append(mbe.ConstraintOverride_quantizeMotionInterpolator, 86);
        f6958k.append(mbe.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    /* renamed from: F */
    public static int m5647F(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5648G(Object obj, TypedArray typedArray, int i, int i2) throws NumberFormatException {
        int dimensionPixelSize;
        boolean z;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        if (i3 == 3) {
            m5649H(obj, typedArray.getString(i), i2);
            return;
        }
        int i4 = 0;
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                z = true;
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (!(obj instanceof ConstraintLayout.LayoutParams)) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
                    layoutParams.a0 = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                    layoutParams.b0 = z;
                    return;
                }
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (i2 == 0) {
                    bVar.f7016d = i4;
                    bVar.n0 = z;
                    return;
                } else {
                    bVar.f7017e = i4;
                    bVar.o0 = z;
                    return;
                }
            }
            if (obj instanceof a.C19557a) {
                a.C19557a c19557a = (a.C19557a) obj;
                if (i2 == 0) {
                    c19557a.m5704b(23, i4);
                    c19557a.m5706d(80, z);
                    return;
                } else {
                    c19557a.m5704b(21, i4);
                    c19557a.m5706d(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        i4 = dimensionPixelSize;
        z = false;
        if (!(obj instanceof ConstraintLayout.LayoutParams)) {
        }
    }

    /* renamed from: H */
    public static void m5649H(Object obj, String str, int i) throws NumberFormatException {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                    }
                    m5650I(layoutParams, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f6987A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C19557a) {
                        ((a.C19557a) obj).m5705c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                            layoutParams2.f6886L = f;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                            layoutParams2.f6887M = f;
                        }
                    } else if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (i == 0) {
                            bVar.f7016d = 0;
                            bVar.f7009W = f;
                        } else {
                            bVar.f7017e = 0;
                            bVar.f7008V = f;
                        }
                    } else if (obj instanceof a.C19557a) {
                        a.C19557a c19557a = (a.C19557a) obj;
                        if (i == 0) {
                            c19557a.m5704b(23, 0);
                            c19557a.m5703a(39, f);
                        } else {
                            c19557a.m5704b(21, 0);
                            c19557a.m5703a(40, f);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.f6896V = fMax;
                            layoutParams3.f6890P = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.f6897W = fMax;
                            layoutParams3.f6891Q = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar2 = (b) obj;
                        if (i == 0) {
                            bVar2.f7016d = 0;
                            bVar2.f0 = fMax;
                            bVar2.f7012Z = 2;
                        } else {
                            bVar2.f7017e = 0;
                            bVar2.g0 = fMax;
                            bVar2.a0 = 2;
                        }
                    } else if (obj instanceof a.C19557a) {
                        a.C19557a c19557a2 = (a.C19557a) obj;
                        if (i == 0) {
                            c19557a2.m5704b(23, 0);
                            c19557a2.m5704b(54, 2);
                        } else {
                            c19557a2.m5704b(21, 0);
                            c19557a2.m5704b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: I */
    public static void m5650I(ConstraintLayout.LayoutParams layoutParams, String str) throws NumberFormatException {
        float fAbs = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i2);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i2, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            fAbs = i == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.f6883I = str;
        layoutParams.f6884J = fAbs;
        layoutParams.f6885K = i;
    }

    /* renamed from: K */
    public static void m5651K(a aVar, TypedArray typedArray) throws NumberFormatException {
        int indexCount = typedArray.getIndexCount();
        a.C19557a c19557a = new a.C19557a();
        aVar.f6974h = c19557a;
        aVar.f6970d.f7040a = false;
        aVar.f6971e.f7014b = false;
        aVar.f6969c.f7054a = false;
        aVar.f6972f.f7060a = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f6958k.get(index)) {
                case 2:
                    c19557a.m5704b(2, typedArray.getDimensionPixelSize(index, aVar.f6971e.f6997K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                case 30:
                case 32:
                case 33:
                case 35:
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 61:
                case Opcodes.POP2 /* 88 */:
                case Opcodes.DUP /* 89 */:
                case Opcodes.DUP_X1 /* 90 */:
                case Opcodes.DUP_X2 /* 91 */:
                case Opcodes.DUP2 /* 92 */:
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(f6957j.get(index));
                    break;
                case 5:
                    c19557a.m5705c(5, typedArray.getString(index));
                    break;
                case 6:
                    c19557a.m5704b(6, typedArray.getDimensionPixelOffset(index, aVar.f6971e.f6991E));
                    break;
                case 7:
                    c19557a.m5704b(7, typedArray.getDimensionPixelOffset(index, aVar.f6971e.f6992F));
                    break;
                case 8:
                    c19557a.m5704b(8, typedArray.getDimensionPixelSize(index, aVar.f6971e.f6998L));
                    break;
                case 11:
                    c19557a.m5704b(11, typedArray.getDimensionPixelSize(index, aVar.f6971e.f7004R));
                    break;
                case 12:
                    c19557a.m5704b(12, typedArray.getDimensionPixelSize(index, aVar.f6971e.f7005S));
                    break;
                case 13:
                    c19557a.m5704b(13, typedArray.getDimensionPixelSize(index, aVar.f6971e.f7001O));
                    break;
                case 14:
                    c19557a.m5704b(14, typedArray.getDimensionPixelSize(index, aVar.f6971e.f7003Q));
                    break;
                case 15:
                    c19557a.m5704b(15, typedArray.getDimensionPixelSize(index, aVar.f6971e.f7006T));
                    break;
                case 16:
                    c19557a.m5704b(16, typedArray.getDimensionPixelSize(index, aVar.f6971e.f7002P));
                    break;
                case 17:
                    c19557a.m5704b(17, typedArray.getDimensionPixelOffset(index, aVar.f6971e.f7018f));
                    break;
                case 18:
                    c19557a.m5704b(18, typedArray.getDimensionPixelOffset(index, aVar.f6971e.f7019g));
                    break;
                case 19:
                    c19557a.m5703a(19, typedArray.getFloat(index, aVar.f6971e.f7020h));
                    break;
                case 20:
                    c19557a.m5703a(20, typedArray.getFloat(index, aVar.f6971e.f7037y));
                    break;
                case 21:
                    c19557a.m5704b(21, typedArray.getLayoutDimension(index, aVar.f6971e.f7017e));
                    break;
                case 22:
                    c19557a.m5704b(22, f6956i[typedArray.getInt(index, aVar.f6969c.f7055b)]);
                    break;
                case 23:
                    c19557a.m5704b(23, typedArray.getLayoutDimension(index, aVar.f6971e.f7016d));
                    break;
                case 24:
                    c19557a.m5704b(24, typedArray.getDimensionPixelSize(index, aVar.f6971e.f6994H));
                    break;
                case 27:
                    c19557a.m5704b(27, typedArray.getInt(index, aVar.f6971e.f6993G));
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    c19557a.m5704b(28, typedArray.getDimensionPixelSize(index, aVar.f6971e.f6995I));
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    c19557a.m5704b(31, typedArray.getDimensionPixelSize(index, aVar.f6971e.f6999M));
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    c19557a.m5704b(34, typedArray.getDimensionPixelSize(index, aVar.f6971e.f6996J));
                    break;
                case 37:
                    c19557a.m5703a(37, typedArray.getFloat(index, aVar.f6971e.f7038z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f6967a);
                    aVar.f6967a = resourceId;
                    c19557a.m5704b(38, resourceId);
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    c19557a.m5703a(39, typedArray.getFloat(index, aVar.f6971e.f7009W));
                    break;
                case 40:
                    c19557a.m5703a(40, typedArray.getFloat(index, aVar.f6971e.f7008V));
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    c19557a.m5704b(41, typedArray.getInt(index, aVar.f6971e.f7010X));
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    c19557a.m5704b(42, typedArray.getInt(index, aVar.f6971e.f7011Y));
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    c19557a.m5703a(43, typedArray.getFloat(index, aVar.f6969c.f7057d));
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    c19557a.m5706d(44, true);
                    c19557a.m5703a(44, typedArray.getDimension(index, aVar.f6972f.f7073n));
                    break;
                case 45:
                    c19557a.m5703a(45, typedArray.getFloat(index, aVar.f6972f.f7062c));
                    break;
                case 46:
                    c19557a.m5703a(46, typedArray.getFloat(index, aVar.f6972f.f7063d));
                    break;
                case 47:
                    c19557a.m5703a(47, typedArray.getFloat(index, aVar.f6972f.f7064e));
                    break;
                case 48:
                    c19557a.m5703a(48, typedArray.getFloat(index, aVar.f6972f.f7065f));
                    break;
                case 49:
                    c19557a.m5703a(49, typedArray.getDimension(index, aVar.f6972f.f7066g));
                    break;
                case 50:
                    c19557a.m5703a(50, typedArray.getDimension(index, aVar.f6972f.f7067h));
                    break;
                case 51:
                    c19557a.m5703a(51, typedArray.getDimension(index, aVar.f6972f.f7069j));
                    break;
                case 52:
                    c19557a.m5703a(52, typedArray.getDimension(index, aVar.f6972f.f7070k));
                    break;
                case 53:
                    c19557a.m5703a(53, typedArray.getDimension(index, aVar.f6972f.f7071l));
                    break;
                case 54:
                    c19557a.m5704b(54, typedArray.getInt(index, aVar.f6971e.f7012Z));
                    break;
                case 55:
                    c19557a.m5704b(55, typedArray.getInt(index, aVar.f6971e.a0));
                    break;
                case 56:
                    c19557a.m5704b(56, typedArray.getDimensionPixelSize(index, aVar.f6971e.b0));
                    break;
                case 57:
                    c19557a.m5704b(57, typedArray.getDimensionPixelSize(index, aVar.f6971e.c0));
                    break;
                case 58:
                    c19557a.m5704b(58, typedArray.getDimensionPixelSize(index, aVar.f6971e.d0));
                    break;
                case Opcodes.V15 /* 59 */:
                    c19557a.m5704b(59, typedArray.getDimensionPixelSize(index, aVar.f6971e.e0));
                    break;
                case Opcodes.V16 /* 60 */:
                    c19557a.m5703a(60, typedArray.getFloat(index, aVar.f6972f.f7061b));
                    break;
                case 62:
                    c19557a.m5704b(62, typedArray.getDimensionPixelSize(index, aVar.f6971e.f6989C));
                    break;
                case 63:
                    c19557a.m5703a(63, typedArray.getFloat(index, aVar.f6971e.f6990D));
                    break;
                case 64:
                    c19557a.m5704b(64, m5647F(typedArray, index, aVar.f6970d.f7041b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c19557a.m5705c(65, typedArray.getString(index));
                        break;
                    } else {
                        c19557a.m5705c(65, q26.f41164c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    c19557a.m5704b(66, typedArray.getInt(index, 0));
                    break;
                case TypeReference.INSTANCEOF /* 67 */:
                    c19557a.m5703a(67, typedArray.getFloat(index, aVar.f6970d.f7048i));
                    break;
                case TypeReference.NEW /* 68 */:
                    c19557a.m5703a(68, typedArray.getFloat(index, aVar.f6969c.f7058e));
                    break;
                case TypeReference.CONSTRUCTOR_REFERENCE /* 69 */:
                    c19557a.m5703a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case TypeReference.METHOD_REFERENCE /* 70 */:
                    c19557a.m5703a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case TypeReference.CAST /* 71 */:
                    break;
                case TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
                    c19557a.m5704b(72, typedArray.getInt(index, aVar.f6971e.h0));
                    break;
                case TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT /* 73 */:
                    c19557a.m5704b(73, typedArray.getDimensionPixelSize(index, aVar.f6971e.i0));
                    break;
                case TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT /* 74 */:
                    c19557a.m5705c(74, typedArray.getString(index));
                    break;
                case TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT /* 75 */:
                    c19557a.m5706d(75, typedArray.getBoolean(index, aVar.f6971e.p0));
                    break;
                case 76:
                    c19557a.m5704b(76, typedArray.getInt(index, aVar.f6970d.f7044e));
                    break;
                case 77:
                    c19557a.m5705c(77, typedArray.getString(index));
                    break;
                case 78:
                    c19557a.m5704b(78, typedArray.getInt(index, aVar.f6969c.f7056c));
                    break;
                case Opcodes.IASTORE /* 79 */:
                    c19557a.m5703a(79, typedArray.getFloat(index, aVar.f6970d.f7046g));
                    break;
                case 80:
                    c19557a.m5706d(80, typedArray.getBoolean(index, aVar.f6971e.n0));
                    break;
                case Opcodes.FASTORE /* 81 */:
                    c19557a.m5706d(81, typedArray.getBoolean(index, aVar.f6971e.o0));
                    break;
                case Opcodes.DASTORE /* 82 */:
                    c19557a.m5704b(82, typedArray.getInteger(index, aVar.f6970d.f7042c));
                    break;
                case Opcodes.AASTORE /* 83 */:
                    c19557a.m5704b(83, m5647F(typedArray, index, aVar.f6972f.f7068i));
                    break;
                case Opcodes.BASTORE /* 84 */:
                    c19557a.m5704b(84, typedArray.getInteger(index, aVar.f6970d.f7050k));
                    break;
                case Opcodes.CASTORE /* 85 */:
                    c19557a.m5703a(85, typedArray.getFloat(index, aVar.f6970d.f7049j));
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        aVar.f6970d.f7053n = typedArray.getResourceId(index, -1);
                        c19557a.m5704b(89, aVar.f6970d.f7053n);
                        c cVar = aVar.f6970d;
                        if (cVar.f7053n != -1) {
                            cVar.f7052m = -2;
                            c19557a.m5704b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i2 == 3) {
                        aVar.f6970d.f7051l = typedArray.getString(index);
                        c19557a.m5705c(90, aVar.f6970d.f7051l);
                        if (aVar.f6970d.f7051l.indexOf("/") > 0) {
                            aVar.f6970d.f7053n = typedArray.getResourceId(index, -1);
                            c19557a.m5704b(89, aVar.f6970d.f7053n);
                            aVar.f6970d.f7052m = -2;
                            c19557a.m5704b(88, -2);
                            break;
                        } else {
                            aVar.f6970d.f7052m = -1;
                            c19557a.m5704b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.f6970d;
                        cVar2.f7052m = typedArray.getInteger(index, cVar2.f7053n);
                        c19557a.m5704b(88, aVar.f6970d.f7052m);
                        break;
                    }
                case Opcodes.POP /* 87 */:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unused attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f6957j.get(index));
                    break;
                case Opcodes.DUP2_X1 /* 93 */:
                    c19557a.m5704b(93, typedArray.getDimensionPixelSize(index, aVar.f6971e.f7000N));
                    break;
                case Opcodes.DUP2_X2 /* 94 */:
                    c19557a.m5704b(94, typedArray.getDimensionPixelSize(index, aVar.f6971e.f7007U));
                    break;
                case Opcodes.SWAP /* 95 */:
                    m5648G(c19557a, typedArray, index, 0);
                    break;
                case 96:
                    m5648G(c19557a, typedArray, index, 1);
                    break;
                case Opcodes.LADD /* 97 */:
                    c19557a.m5704b(97, typedArray.getInt(index, aVar.f6971e.q0));
                    break;
                case Opcodes.FADD /* 98 */:
                    if (MotionLayout.R1) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f6967a);
                        aVar.f6967a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f6968b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f6968b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f6967a = typedArray.getResourceId(index, aVar.f6967a);
                        break;
                    }
                case Opcodes.DADD /* 99 */:
                    c19557a.m5706d(99, typedArray.getBoolean(index, aVar.f6971e.f7021i));
                    break;
            }
        }
    }

    /* renamed from: N */
    public static void m5652N(a aVar, int i, float f) {
        if (i == 19) {
            aVar.f6971e.f7020h = f;
        }
        if (i == 20) {
            aVar.f6971e.f7037y = f;
            return;
        }
        if (i == 37) {
            aVar.f6971e.f7038z = f;
            return;
        }
        if (i == 60) {
            aVar.f6972f.f7061b = f;
            return;
        }
        if (i == 63) {
            aVar.f6971e.f6990D = f;
            return;
        }
        if (i == 79) {
            aVar.f6970d.f7046g = f;
            return;
        }
        if (i == 85) {
            aVar.f6970d.f7049j = f;
            return;
        }
        if (i == 39) {
            aVar.f6971e.f7009W = f;
            return;
        }
        if (i == 40) {
            aVar.f6971e.f7008V = f;
            return;
        }
        switch (i) {
            case SignatureVisitor.EXTENDS /* 43 */:
                aVar.f6969c.f7057d = f;
                break;
            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                e eVar = aVar.f6972f;
                eVar.f7073n = f;
                eVar.f7072m = true;
                break;
            case 45:
                aVar.f6972f.f7062c = f;
                break;
            case 46:
                aVar.f6972f.f7063d = f;
                break;
            case 47:
                aVar.f6972f.f7064e = f;
                break;
            case 48:
                aVar.f6972f.f7065f = f;
                break;
            case 49:
                aVar.f6972f.f7066g = f;
                break;
            case 50:
                aVar.f6972f.f7067h = f;
                break;
            case 51:
                aVar.f6972f.f7069j = f;
                break;
            case 52:
                aVar.f6972f.f7070k = f;
                break;
            case 53:
                aVar.f6972f.f7071l = f;
                break;
            default:
                switch (i) {
                    case TypeReference.INSTANCEOF /* 67 */:
                        aVar.f6970d.f7048i = f;
                        break;
                    case TypeReference.NEW /* 68 */:
                        aVar.f6969c.f7058e = f;
                        break;
                    case TypeReference.CONSTRUCTOR_REFERENCE /* 69 */:
                        aVar.f6971e.f0 = f;
                        break;
                    case TypeReference.METHOD_REFERENCE /* 70 */:
                        aVar.f6971e.g0 = f;
                        break;
                }
        }
    }

    /* renamed from: O */
    public static void m5653O(a aVar, int i, int i2) {
        if (i == 6) {
            aVar.f6971e.f6991E = i2;
        }
        if (i == 7) {
            aVar.f6971e.f6992F = i2;
            return;
        }
        if (i == 8) {
            aVar.f6971e.f6998L = i2;
            return;
        }
        if (i == 27) {
            aVar.f6971e.f6993G = i2;
            return;
        }
        if (i == 28) {
            aVar.f6971e.f6995I = i2;
            return;
        }
        if (i == 41) {
            aVar.f6971e.f7010X = i2;
            return;
        }
        if (i == 42) {
            aVar.f6971e.f7011Y = i2;
            return;
        }
        if (i == 61) {
            aVar.f6971e.f6988B = i2;
            return;
        }
        if (i == 62) {
            aVar.f6971e.f6989C = i2;
            return;
        }
        if (i == 72) {
            aVar.f6971e.h0 = i2;
            return;
        }
        if (i == 73) {
            aVar.f6971e.i0 = i2;
            return;
        }
        if (i == 88) {
            aVar.f6970d.f7052m = i2;
            return;
        }
        if (i == 89) {
            aVar.f6970d.f7053n = i2;
            return;
        }
        switch (i) {
            case 2:
                aVar.f6971e.f6997K = i2;
                break;
            case 11:
                aVar.f6971e.f7004R = i2;
                break;
            case 12:
                aVar.f6971e.f7005S = i2;
                break;
            case 13:
                aVar.f6971e.f7001O = i2;
                break;
            case 14:
                aVar.f6971e.f7003Q = i2;
                break;
            case 15:
                aVar.f6971e.f7006T = i2;
                break;
            case 16:
                aVar.f6971e.f7002P = i2;
                break;
            case 17:
                aVar.f6971e.f7018f = i2;
                break;
            case 18:
                aVar.f6971e.f7019g = i2;
                break;
            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                aVar.f6971e.f6999M = i2;
                break;
            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                aVar.f6971e.f6996J = i2;
                break;
            case 38:
                aVar.f6967a = i2;
                break;
            case 64:
                aVar.f6970d.f7041b = i2;
                break;
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                aVar.f6970d.f7045f = i2;
                break;
            case 76:
                aVar.f6970d.f7044e = i2;
                break;
            case 78:
                aVar.f6969c.f7056c = i2;
                break;
            case Opcodes.DUP2_X1 /* 93 */:
                aVar.f6971e.f7000N = i2;
                break;
            case Opcodes.DUP2_X2 /* 94 */:
                aVar.f6971e.f7007U = i2;
                break;
            case Opcodes.LADD /* 97 */:
                aVar.f6971e.q0 = i2;
                break;
            default:
                switch (i) {
                    case 21:
                        aVar.f6971e.f7017e = i2;
                        break;
                    case 22:
                        aVar.f6969c.f7055b = i2;
                        break;
                    case 23:
                        aVar.f6971e.f7016d = i2;
                        break;
                    case 24:
                        aVar.f6971e.f6994H = i2;
                        break;
                    default:
                        switch (i) {
                            case 54:
                                aVar.f6971e.f7012Z = i2;
                                break;
                            case 55:
                                aVar.f6971e.a0 = i2;
                                break;
                            case 56:
                                aVar.f6971e.b0 = i2;
                                break;
                            case 57:
                                aVar.f6971e.c0 = i2;
                                break;
                            case 58:
                                aVar.f6971e.d0 = i2;
                                break;
                            case Opcodes.V15 /* 59 */:
                                aVar.f6971e.e0 = i2;
                                break;
                            default:
                                switch (i) {
                                    case Opcodes.DASTORE /* 82 */:
                                        aVar.f6970d.f7042c = i2;
                                        break;
                                    case Opcodes.AASTORE /* 83 */:
                                        aVar.f6972f.f7068i = i2;
                                        break;
                                    case Opcodes.BASTORE /* 84 */:
                                        aVar.f6970d.f7050k = i2;
                                        break;
                                }
                        }
                }
        }
    }

    /* renamed from: P */
    public static void m5654P(a aVar, int i, String str) {
        if (i == 5) {
            aVar.f6971e.f6987A = str;
            return;
        }
        if (i == 65) {
            aVar.f6970d.f7043d = str;
            return;
        }
        if (i == 74) {
            b bVar = aVar.f6971e;
            bVar.l0 = str;
            bVar.k0 = null;
        } else if (i == 77) {
            aVar.f6971e.m0 = str;
        } else {
            if (i != 90) {
                return;
            }
            aVar.f6970d.f7051l = str;
        }
    }

    /* renamed from: Q */
    public static void m5655Q(a aVar, int i, boolean z) {
        if (i == 44) {
            aVar.f6972f.f7072m = z;
            return;
        }
        if (i == 75) {
            aVar.f6971e.p0 = z;
        } else if (i == 80) {
            aVar.f6971e.n0 = z;
        } else {
            if (i != 81) {
                return;
            }
            aVar.f6971e.o0 = z;
        }
    }

    /* renamed from: m */
    public static a m5662m(Context context, XmlPullParser xmlPullParser) throws NumberFormatException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, mbe.ConstraintOverride);
        m5651K(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: A */
    public int m5663A(int i) {
        return m5689v(i).f6969c.f7055b;
    }

    /* renamed from: B */
    public int m5664B(int i) {
        return m5689v(i).f6969c.f7056c;
    }

    /* renamed from: C */
    public int m5665C(int i) {
        return m5689v(i).f6971e.f7016d;
    }

    /* renamed from: D */
    public void m5666D(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarM5688u = m5688u(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarM5688u.f6971e.f7013a = true;
                    }
                    this.f6966h.put(Integer.valueOf(aVarM5688u.f6967a), aVarM5688u);
                }
            }
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing resource: ");
            sb.append(i);
        } catch (XmlPullParserException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing resource: ");
            sb2.append(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cb, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m5667E(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        a aVarM5688u;
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        switch (xmlPullParser.getName()) {
                            case "Constraint":
                                aVarM5688u = m5688u(context, Xml.asAttributeSet(xmlPullParser), false);
                                break;
                            case "ConstraintOverride":
                                aVarM5688u = m5688u(context, Xml.asAttributeSet(xmlPullParser), true);
                                break;
                            case "Guideline":
                                aVarM5688u = m5688u(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVarM5688u.f6971e;
                                bVar.f7013a = true;
                                bVar.f7014b = true;
                                break;
                            case "Barrier":
                                aVarM5688u = m5688u(context, Xml.asAttributeSet(xmlPullParser), false);
                                aVarM5688u.f6971e.j0 = 1;
                                break;
                            case "PropertySet":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f6969c.m5713b(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                            case "Transform":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f6972f.m5715b(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                            case "Layout":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f6971e.m5709b(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                            case "Motion":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f6970d.m5711b(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                            case "CustomAttribute":
                            case "CustomMethod":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                C2004a.m5637i(context, xmlPullParser, aVar.f6973g);
                                continue;
                        }
                        aVar = aVarM5688u;
                    } else if (eventType == 3) {
                        String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    break;
                                }
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    break;
                                }
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    break;
                                }
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    break;
                                }
                                break;
                        }
                        if (r4 == 0) {
                            return;
                        }
                        if (r4 == 1 || r4 == 2 || r4 == 3) {
                            this.f6966h.put(Integer.valueOf(aVar.f6967a), aVar);
                            aVar = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* renamed from: J */
    public final void m5668J(a aVar, TypedArray typedArray, boolean z) throws NumberFormatException {
        if (z) {
            m5651K(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != mbe.Constraint_android_id && mbe.Constraint_android_layout_marginStart != index && mbe.Constraint_android_layout_marginEnd != index) {
                aVar.f6970d.f7040a = true;
                aVar.f6971e.f7014b = true;
                aVar.f6969c.f7054a = true;
                aVar.f6972f.f7060a = true;
            }
            switch (f6957j.get(index)) {
                case 1:
                    b bVar = aVar.f6971e;
                    bVar.f7030r = m5647F(typedArray, index, bVar.f7030r);
                    break;
                case 2:
                    b bVar2 = aVar.f6971e;
                    bVar2.f6997K = typedArray.getDimensionPixelSize(index, bVar2.f6997K);
                    break;
                case 3:
                    b bVar3 = aVar.f6971e;
                    bVar3.f7029q = m5647F(typedArray, index, bVar3.f7029q);
                    break;
                case 4:
                    b bVar4 = aVar.f6971e;
                    bVar4.f7028p = m5647F(typedArray, index, bVar4.f7028p);
                    break;
                case 5:
                    aVar.f6971e.f6987A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f6971e;
                    bVar5.f6991E = typedArray.getDimensionPixelOffset(index, bVar5.f6991E);
                    break;
                case 7:
                    b bVar6 = aVar.f6971e;
                    bVar6.f6992F = typedArray.getDimensionPixelOffset(index, bVar6.f6992F);
                    break;
                case 8:
                    b bVar7 = aVar.f6971e;
                    bVar7.f6998L = typedArray.getDimensionPixelSize(index, bVar7.f6998L);
                    break;
                case 9:
                    b bVar8 = aVar.f6971e;
                    bVar8.f7036x = m5647F(typedArray, index, bVar8.f7036x);
                    break;
                case 10:
                    b bVar9 = aVar.f6971e;
                    bVar9.f7035w = m5647F(typedArray, index, bVar9.f7035w);
                    break;
                case 11:
                    b bVar10 = aVar.f6971e;
                    bVar10.f7004R = typedArray.getDimensionPixelSize(index, bVar10.f7004R);
                    break;
                case 12:
                    b bVar11 = aVar.f6971e;
                    bVar11.f7005S = typedArray.getDimensionPixelSize(index, bVar11.f7005S);
                    break;
                case 13:
                    b bVar12 = aVar.f6971e;
                    bVar12.f7001O = typedArray.getDimensionPixelSize(index, bVar12.f7001O);
                    break;
                case 14:
                    b bVar13 = aVar.f6971e;
                    bVar13.f7003Q = typedArray.getDimensionPixelSize(index, bVar13.f7003Q);
                    break;
                case 15:
                    b bVar14 = aVar.f6971e;
                    bVar14.f7006T = typedArray.getDimensionPixelSize(index, bVar14.f7006T);
                    break;
                case 16:
                    b bVar15 = aVar.f6971e;
                    bVar15.f7002P = typedArray.getDimensionPixelSize(index, bVar15.f7002P);
                    break;
                case 17:
                    b bVar16 = aVar.f6971e;
                    bVar16.f7018f = typedArray.getDimensionPixelOffset(index, bVar16.f7018f);
                    break;
                case 18:
                    b bVar17 = aVar.f6971e;
                    bVar17.f7019g = typedArray.getDimensionPixelOffset(index, bVar17.f7019g);
                    break;
                case 19:
                    b bVar18 = aVar.f6971e;
                    bVar18.f7020h = typedArray.getFloat(index, bVar18.f7020h);
                    break;
                case 20:
                    b bVar19 = aVar.f6971e;
                    bVar19.f7037y = typedArray.getFloat(index, bVar19.f7037y);
                    break;
                case 21:
                    b bVar20 = aVar.f6971e;
                    bVar20.f7017e = typedArray.getLayoutDimension(index, bVar20.f7017e);
                    break;
                case 22:
                    d dVar = aVar.f6969c;
                    dVar.f7055b = typedArray.getInt(index, dVar.f7055b);
                    d dVar2 = aVar.f6969c;
                    dVar2.f7055b = f6956i[dVar2.f7055b];
                    break;
                case 23:
                    b bVar21 = aVar.f6971e;
                    bVar21.f7016d = typedArray.getLayoutDimension(index, bVar21.f7016d);
                    break;
                case 24:
                    b bVar22 = aVar.f6971e;
                    bVar22.f6994H = typedArray.getDimensionPixelSize(index, bVar22.f6994H);
                    break;
                case 25:
                    b bVar23 = aVar.f6971e;
                    bVar23.f7022j = m5647F(typedArray, index, bVar23.f7022j);
                    break;
                case 26:
                    b bVar24 = aVar.f6971e;
                    bVar24.f7023k = m5647F(typedArray, index, bVar24.f7023k);
                    break;
                case 27:
                    b bVar25 = aVar.f6971e;
                    bVar25.f6993G = typedArray.getInt(index, bVar25.f6993G);
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    b bVar26 = aVar.f6971e;
                    bVar26.f6995I = typedArray.getDimensionPixelSize(index, bVar26.f6995I);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    b bVar27 = aVar.f6971e;
                    bVar27.f7024l = m5647F(typedArray, index, bVar27.f7024l);
                    break;
                case 30:
                    b bVar28 = aVar.f6971e;
                    bVar28.f7025m = m5647F(typedArray, index, bVar28.f7025m);
                    break;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    b bVar29 = aVar.f6971e;
                    bVar29.f6999M = typedArray.getDimensionPixelSize(index, bVar29.f6999M);
                    break;
                case 32:
                    b bVar30 = aVar.f6971e;
                    bVar30.f7033u = m5647F(typedArray, index, bVar30.f7033u);
                    break;
                case 33:
                    b bVar31 = aVar.f6971e;
                    bVar31.f7034v = m5647F(typedArray, index, bVar31.f7034v);
                    break;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    b bVar32 = aVar.f6971e;
                    bVar32.f6996J = typedArray.getDimensionPixelSize(index, bVar32.f6996J);
                    break;
                case 35:
                    b bVar33 = aVar.f6971e;
                    bVar33.f7027o = m5647F(typedArray, index, bVar33.f7027o);
                    break;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    b bVar34 = aVar.f6971e;
                    bVar34.f7026n = m5647F(typedArray, index, bVar34.f7026n);
                    break;
                case 37:
                    b bVar35 = aVar.f6971e;
                    bVar35.f7038z = typedArray.getFloat(index, bVar35.f7038z);
                    break;
                case 38:
                    aVar.f6967a = typedArray.getResourceId(index, aVar.f6967a);
                    break;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    b bVar36 = aVar.f6971e;
                    bVar36.f7009W = typedArray.getFloat(index, bVar36.f7009W);
                    break;
                case 40:
                    b bVar37 = aVar.f6971e;
                    bVar37.f7008V = typedArray.getFloat(index, bVar37.f7008V);
                    break;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    b bVar38 = aVar.f6971e;
                    bVar38.f7010X = typedArray.getInt(index, bVar38.f7010X);
                    break;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    b bVar39 = aVar.f6971e;
                    bVar39.f7011Y = typedArray.getInt(index, bVar39.f7011Y);
                    break;
                case SignatureVisitor.EXTENDS /* 43 */:
                    d dVar3 = aVar.f6969c;
                    dVar3.f7057d = typedArray.getFloat(index, dVar3.f7057d);
                    break;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    e eVar = aVar.f6972f;
                    eVar.f7072m = true;
                    eVar.f7073n = typedArray.getDimension(index, eVar.f7073n);
                    break;
                case 45:
                    e eVar2 = aVar.f6972f;
                    eVar2.f7062c = typedArray.getFloat(index, eVar2.f7062c);
                    break;
                case 46:
                    e eVar3 = aVar.f6972f;
                    eVar3.f7063d = typedArray.getFloat(index, eVar3.f7063d);
                    break;
                case 47:
                    e eVar4 = aVar.f6972f;
                    eVar4.f7064e = typedArray.getFloat(index, eVar4.f7064e);
                    break;
                case 48:
                    e eVar5 = aVar.f6972f;
                    eVar5.f7065f = typedArray.getFloat(index, eVar5.f7065f);
                    break;
                case 49:
                    e eVar6 = aVar.f6972f;
                    eVar6.f7066g = typedArray.getDimension(index, eVar6.f7066g);
                    break;
                case 50:
                    e eVar7 = aVar.f6972f;
                    eVar7.f7067h = typedArray.getDimension(index, eVar7.f7067h);
                    break;
                case 51:
                    e eVar8 = aVar.f6972f;
                    eVar8.f7069j = typedArray.getDimension(index, eVar8.f7069j);
                    break;
                case 52:
                    e eVar9 = aVar.f6972f;
                    eVar9.f7070k = typedArray.getDimension(index, eVar9.f7070k);
                    break;
                case 53:
                    e eVar10 = aVar.f6972f;
                    eVar10.f7071l = typedArray.getDimension(index, eVar10.f7071l);
                    break;
                case 54:
                    b bVar40 = aVar.f6971e;
                    bVar40.f7012Z = typedArray.getInt(index, bVar40.f7012Z);
                    break;
                case 55:
                    b bVar41 = aVar.f6971e;
                    bVar41.a0 = typedArray.getInt(index, bVar41.a0);
                    break;
                case 56:
                    b bVar42 = aVar.f6971e;
                    bVar42.b0 = typedArray.getDimensionPixelSize(index, bVar42.b0);
                    break;
                case 57:
                    b bVar43 = aVar.f6971e;
                    bVar43.c0 = typedArray.getDimensionPixelSize(index, bVar43.c0);
                    break;
                case 58:
                    b bVar44 = aVar.f6971e;
                    bVar44.d0 = typedArray.getDimensionPixelSize(index, bVar44.d0);
                    break;
                case Opcodes.V15 /* 59 */:
                    b bVar45 = aVar.f6971e;
                    bVar45.e0 = typedArray.getDimensionPixelSize(index, bVar45.e0);
                    break;
                case Opcodes.V16 /* 60 */:
                    e eVar11 = aVar.f6972f;
                    eVar11.f7061b = typedArray.getFloat(index, eVar11.f7061b);
                    break;
                case 61:
                    b bVar46 = aVar.f6971e;
                    bVar46.f6988B = m5647F(typedArray, index, bVar46.f6988B);
                    break;
                case 62:
                    b bVar47 = aVar.f6971e;
                    bVar47.f6989C = typedArray.getDimensionPixelSize(index, bVar47.f6989C);
                    break;
                case 63:
                    b bVar48 = aVar.f6971e;
                    bVar48.f6990D = typedArray.getFloat(index, bVar48.f6990D);
                    break;
                case 64:
                    c cVar = aVar.f6970d;
                    cVar.f7041b = m5647F(typedArray, index, cVar.f7041b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f6970d.f7043d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f6970d.f7043d = q26.f41164c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    aVar.f6970d.f7045f = typedArray.getInt(index, 0);
                    break;
                case TypeReference.INSTANCEOF /* 67 */:
                    c cVar2 = aVar.f6970d;
                    cVar2.f7048i = typedArray.getFloat(index, cVar2.f7048i);
                    break;
                case TypeReference.NEW /* 68 */:
                    d dVar4 = aVar.f6969c;
                    dVar4.f7058e = typedArray.getFloat(index, dVar4.f7058e);
                    break;
                case TypeReference.CONSTRUCTOR_REFERENCE /* 69 */:
                    aVar.f6971e.f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case TypeReference.METHOD_REFERENCE /* 70 */:
                    aVar.f6971e.g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case TypeReference.CAST /* 71 */:
                    break;
                case TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
                    b bVar49 = aVar.f6971e;
                    bVar49.h0 = typedArray.getInt(index, bVar49.h0);
                    break;
                case TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT /* 73 */:
                    b bVar50 = aVar.f6971e;
                    bVar50.i0 = typedArray.getDimensionPixelSize(index, bVar50.i0);
                    break;
                case TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT /* 74 */:
                    aVar.f6971e.l0 = typedArray.getString(index);
                    break;
                case TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT /* 75 */:
                    b bVar51 = aVar.f6971e;
                    bVar51.p0 = typedArray.getBoolean(index, bVar51.p0);
                    break;
                case 76:
                    c cVar3 = aVar.f6970d;
                    cVar3.f7044e = typedArray.getInt(index, cVar3.f7044e);
                    break;
                case 77:
                    aVar.f6971e.m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f6969c;
                    dVar5.f7056c = typedArray.getInt(index, dVar5.f7056c);
                    break;
                case Opcodes.IASTORE /* 79 */:
                    c cVar4 = aVar.f6970d;
                    cVar4.f7046g = typedArray.getFloat(index, cVar4.f7046g);
                    break;
                case 80:
                    b bVar52 = aVar.f6971e;
                    bVar52.n0 = typedArray.getBoolean(index, bVar52.n0);
                    break;
                case Opcodes.FASTORE /* 81 */:
                    b bVar53 = aVar.f6971e;
                    bVar53.o0 = typedArray.getBoolean(index, bVar53.o0);
                    break;
                case Opcodes.DASTORE /* 82 */:
                    c cVar5 = aVar.f6970d;
                    cVar5.f7042c = typedArray.getInteger(index, cVar5.f7042c);
                    break;
                case Opcodes.AASTORE /* 83 */:
                    e eVar12 = aVar.f6972f;
                    eVar12.f7068i = m5647F(typedArray, index, eVar12.f7068i);
                    break;
                case Opcodes.BASTORE /* 84 */:
                    c cVar6 = aVar.f6970d;
                    cVar6.f7050k = typedArray.getInteger(index, cVar6.f7050k);
                    break;
                case Opcodes.CASTORE /* 85 */:
                    c cVar7 = aVar.f6970d;
                    cVar7.f7049j = typedArray.getFloat(index, cVar7.f7049j);
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        aVar.f6970d.f7053n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f6970d;
                        if (cVar8.f7053n != -1) {
                            cVar8.f7052m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i2 == 3) {
                        aVar.f6970d.f7051l = typedArray.getString(index);
                        if (aVar.f6970d.f7051l.indexOf("/") > 0) {
                            aVar.f6970d.f7053n = typedArray.getResourceId(index, -1);
                            aVar.f6970d.f7052m = -2;
                            break;
                        } else {
                            aVar.f6970d.f7052m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.f6970d;
                        cVar9.f7052m = typedArray.getInteger(index, cVar9.f7053n);
                        break;
                    }
                case Opcodes.POP /* 87 */:
                    StringBuilder sb = new StringBuilder();
                    sb.append("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(f6957j.get(index));
                    break;
                case Opcodes.POP2 /* 88 */:
                case Opcodes.DUP /* 89 */:
                case Opcodes.DUP_X1 /* 90 */:
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f6957j.get(index));
                    break;
                case Opcodes.DUP_X2 /* 91 */:
                    b bVar54 = aVar.f6971e;
                    bVar54.f7031s = m5647F(typedArray, index, bVar54.f7031s);
                    break;
                case Opcodes.DUP2 /* 92 */:
                    b bVar55 = aVar.f6971e;
                    bVar55.f7032t = m5647F(typedArray, index, bVar55.f7032t);
                    break;
                case Opcodes.DUP2_X1 /* 93 */:
                    b bVar56 = aVar.f6971e;
                    bVar56.f7000N = typedArray.getDimensionPixelSize(index, bVar56.f7000N);
                    break;
                case Opcodes.DUP2_X2 /* 94 */:
                    b bVar57 = aVar.f6971e;
                    bVar57.f7007U = typedArray.getDimensionPixelSize(index, bVar57.f7007U);
                    break;
                case Opcodes.SWAP /* 95 */:
                    m5648G(aVar.f6971e, typedArray, index, 0);
                    break;
                case 96:
                    m5648G(aVar.f6971e, typedArray, index, 1);
                    break;
                case Opcodes.LADD /* 97 */:
                    b bVar58 = aVar.f6971e;
                    bVar58.q0 = typedArray.getInt(index, bVar58.q0);
                    break;
            }
        }
        b bVar59 = aVar.f6971e;
        if (bVar59.l0 != null) {
            bVar59.k0 = null;
        }
    }

    /* renamed from: L */
    public void m5669L(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f6965g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f6966h.containsKey(Integer.valueOf(id))) {
                this.f6966h.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f6966h.get(Integer.valueOf(id));
            if (aVar != null) {
                if (!aVar.f6971e.f7014b) {
                    aVar.m5700g(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        aVar.f6971e.k0 = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f6971e.p0 = barrier.getAllowsGoneWidget();
                            aVar.f6971e.h0 = barrier.getType();
                            aVar.f6971e.i0 = barrier.getMargin();
                        }
                    }
                    aVar.f6971e.f7014b = true;
                }
                d dVar = aVar.f6969c;
                if (!dVar.f7054a) {
                    dVar.f7055b = childAt.getVisibility();
                    aVar.f6969c.f7057d = childAt.getAlpha();
                    aVar.f6969c.f7054a = true;
                }
                e eVar = aVar.f6972f;
                if (!eVar.f7060a) {
                    eVar.f7060a = true;
                    eVar.f7061b = childAt.getRotation();
                    aVar.f6972f.f7062c = childAt.getRotationX();
                    aVar.f6972f.f7063d = childAt.getRotationY();
                    aVar.f6972f.f7064e = childAt.getScaleX();
                    aVar.f6972f.f7065f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || pivotY != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        e eVar2 = aVar.f6972f;
                        eVar2.f7066g = pivotX;
                        eVar2.f7067h = pivotY;
                    }
                    aVar.f6972f.f7069j = childAt.getTranslationX();
                    aVar.f6972f.f7070k = childAt.getTranslationY();
                    aVar.f6972f.f7071l = childAt.getTranslationZ();
                    e eVar3 = aVar.f6972f;
                    if (eVar3.f7072m) {
                        eVar3.f7073n = childAt.getElevation();
                    }
                }
            }
        }
    }

    /* renamed from: M */
    public void m5670M(C2005b c2005b) {
        for (Integer num : c2005b.f6966h.keySet()) {
            int iIntValue = num.intValue();
            a aVar = (a) c2005b.f6966h.get(num);
            if (!this.f6966h.containsKey(Integer.valueOf(iIntValue))) {
                this.f6966h.put(Integer.valueOf(iIntValue), new a());
            }
            a aVar2 = (a) this.f6966h.get(Integer.valueOf(iIntValue));
            if (aVar2 != null) {
                b bVar = aVar2.f6971e;
                if (!bVar.f7014b) {
                    bVar.m5708a(aVar.f6971e);
                }
                d dVar = aVar2.f6969c;
                if (!dVar.f7054a) {
                    dVar.m5712a(aVar.f6969c);
                }
                e eVar = aVar2.f6972f;
                if (!eVar.f7060a) {
                    eVar.m5714a(aVar.f6972f);
                }
                c cVar = aVar2.f6970d;
                if (!cVar.f7040a) {
                    cVar.m5710a(aVar.f6970d);
                }
                for (String str : aVar.f6973g.keySet()) {
                    if (!aVar2.f6973g.containsKey(str)) {
                        aVar2.f6973g.put(str, (C2004a) aVar.f6973g.get(str));
                    }
                }
            }
        }
    }

    /* renamed from: R */
    public void m5671R(boolean z) {
        this.f6965g = z;
    }

    /* renamed from: S */
    public void m5672S(String str) {
        this.f6962d = str.split(",");
        int i = 0;
        while (true) {
            String[] strArr = this.f6962d;
            if (i >= strArr.length) {
                return;
            }
            strArr[i] = strArr[i].trim();
            i++;
        }
    }

    /* renamed from: T */
    public void m5673T(boolean z) {
        this.f6959a = z;
    }

    /* renamed from: U */
    public final String m5674U(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return SQLiteCommandFactory.UNDEFINED;
        }
    }

    /* renamed from: g */
    public void m5675g(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f6966h.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(k75.m35105d(childAt));
            } else {
                if (this.f6965g && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f6966h.containsKey(Integer.valueOf(id)) && (aVar = (a) this.f6966h.get(Integer.valueOf(id))) != null) {
                    C2004a.m5638j(childAt, aVar.f6973g);
                }
            }
        }
    }

    /* renamed from: h */
    public void m5676h(C2005b c2005b) {
        for (a aVar : c2005b.f6966h.values()) {
            if (aVar.f6974h != null) {
                if (aVar.f6968b == null) {
                    aVar.f6974h.m5707e(m5690w(aVar.f6967a));
                } else {
                    Iterator it = this.f6966h.keySet().iterator();
                    while (it.hasNext()) {
                        a aVarM5690w = m5690w(((Integer) it.next()).intValue());
                        String str = aVarM5690w.f6971e.m0;
                        if (str != null && aVar.f6968b.matches(str)) {
                            aVar.f6974h.m5707e(aVarM5690w);
                            aVarM5690w.f6973g.putAll((HashMap) aVar.f6973g.clone());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public void m5677i(ConstraintLayout constraintLayout) {
        m5679k(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* renamed from: j */
    public void m5678j(ConstraintHelper constraintHelper, zt3 zt3Var, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
        a aVar;
        int id = constraintHelper.getId();
        if (this.f6966h.containsKey(Integer.valueOf(id)) && (aVar = (a) this.f6966h.get(Integer.valueOf(id))) != null && (zt3Var instanceof dy7)) {
            constraintHelper.mo5309p(aVar, (dy7) zt3Var, layoutParams, sparseArray);
        }
    }

    /* renamed from: k */
    public void m5679k(ConstraintLayout constraintLayout, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f6966h.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f6966h.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(k75.m35105d(childAt));
            } else {
                if (this.f6965g && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f6966h.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f6966h.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f6971e.j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(aVar.f6971e.h0);
                                barrier.setMargin(aVar.f6971e.i0);
                                barrier.setAllowsGoneWidget(aVar.f6971e.p0);
                                b bVar = aVar.f6971e;
                                int[] iArr = bVar.k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.l0;
                                    if (str != null) {
                                        bVar.k0 = m5687t(barrier, str);
                                        barrier.setReferencedIds(aVar.f6971e.k0);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.m5624c();
                            aVar.m5698e(layoutParams);
                            if (z) {
                                C2004a.m5638j(childAt, aVar.f6973g);
                            }
                            childAt.setLayoutParams(layoutParams);
                            d dVar = aVar.f6969c;
                            if (dVar.f7056c == 0) {
                                childAt.setVisibility(dVar.f7055b);
                            }
                            childAt.setAlpha(aVar.f6969c.f7057d);
                            childAt.setRotation(aVar.f6972f.f7061b);
                            childAt.setRotationX(aVar.f6972f.f7062c);
                            childAt.setRotationY(aVar.f6972f.f7063d);
                            childAt.setScaleX(aVar.f6972f.f7064e);
                            childAt.setScaleY(aVar.f6972f.f7065f);
                            e eVar = aVar.f6972f;
                            if (eVar.f7068i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f6972f.f7068i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f7066g)) {
                                    childAt.setPivotX(aVar.f6972f.f7066g);
                                }
                                if (!Float.isNaN(aVar.f6972f.f7067h)) {
                                    childAt.setPivotY(aVar.f6972f.f7067h);
                                }
                            }
                            childAt.setTranslationX(aVar.f6972f.f7069j);
                            childAt.setTranslationY(aVar.f6972f.f7070k);
                            childAt.setTranslationZ(aVar.f6972f.f7071l);
                            e eVar2 = aVar.f6972f;
                            if (eVar2.f7072m) {
                                childAt.setElevation(eVar2.f7073n);
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("WARNING NO CONSTRAINTS for view ");
                        sb2.append(id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) this.f6966h.get(num);
            if (aVar2 != null) {
                if (aVar2.f6971e.j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = aVar2.f6971e;
                    int[] iArr2 = bVar2.k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.l0;
                        if (str2 != null) {
                            bVar2.k0 = m5687t(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f6971e.k0);
                        }
                    }
                    barrier2.setType(aVar2.f6971e.h0);
                    barrier2.setMargin(aVar2.f6971e.i0);
                    ConstraintLayout.LayoutParams layoutParamsM5609j = constraintLayout.generateDefaultLayoutParams();
                    barrier2.m5601w();
                    aVar2.m5698e(layoutParamsM5609j);
                    constraintLayout.addView(barrier2, layoutParamsM5609j);
                }
                if (aVar2.f6971e.f7013a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsM5609j2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.m5698e(layoutParamsM5609j2);
                    constraintLayout.addView(guideline, layoutParamsM5609j2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).mo5333j(constraintLayout);
            }
        }
    }

    /* renamed from: l */
    public void m5680l(int i, ConstraintLayout.LayoutParams layoutParams) {
        a aVar;
        if (!this.f6966h.containsKey(Integer.valueOf(i)) || (aVar = (a) this.f6966h.get(Integer.valueOf(i))) == null) {
            return;
        }
        aVar.m5698e(layoutParams);
    }

    /* renamed from: n */
    public void m5681n(Context context, int i) {
        m5682o((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: o */
    public void m5682o(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f6966h.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f6965g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f6966h.containsKey(Integer.valueOf(id))) {
                this.f6966h.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f6966h.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.f6973g = C2004a.m5636b(this.f6964f, childAt);
                aVar.m5700g(id, layoutParams);
                aVar.f6969c.f7055b = childAt.getVisibility();
                aVar.f6969c.f7057d = childAt.getAlpha();
                aVar.f6972f.f7061b = childAt.getRotation();
                aVar.f6972f.f7062c = childAt.getRotationX();
                aVar.f6972f.f7063d = childAt.getRotationY();
                aVar.f6972f.f7064e = childAt.getScaleX();
                aVar.f6972f.f7065f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || pivotY != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    e eVar = aVar.f6972f;
                    eVar.f7066g = pivotX;
                    eVar.f7067h = pivotY;
                }
                aVar.f6972f.f7069j = childAt.getTranslationX();
                aVar.f6972f.f7070k = childAt.getTranslationY();
                aVar.f6972f.f7071l = childAt.getTranslationZ();
                e eVar2 = aVar.f6972f;
                if (eVar2.f7072m) {
                    eVar2.f7073n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f6971e.p0 = barrier.getAllowsGoneWidget();
                    aVar.f6971e.k0 = barrier.getReferencedIds();
                    aVar.f6971e.h0 = barrier.getType();
                    aVar.f6971e.i0 = barrier.getMargin();
                }
            }
        }
    }

    /* renamed from: p */
    public void m5683p(C2005b c2005b) {
        this.f6966h.clear();
        for (Integer num : c2005b.f6966h.keySet()) {
            a aVar = (a) c2005b.f6966h.get(num);
            if (aVar != null) {
                this.f6966h.put(num, aVar.clone());
            }
        }
    }

    /* renamed from: q */
    public void m5684q(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f6966h.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f6965g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f6966h.containsKey(Integer.valueOf(id))) {
                this.f6966h.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f6966h.get(Integer.valueOf(id));
            if (aVar != null) {
                if (childAt instanceof ConstraintHelper) {
                    aVar.m5702i((ConstraintHelper) childAt, id, layoutParams);
                }
                aVar.m5701h(id, layoutParams);
            }
        }
    }

    /* renamed from: r */
    public void m5685r(int i, int i2, int i3, int i4, int i5) {
        if (!this.f6966h.containsKey(Integer.valueOf(i))) {
            this.f6966h.put(Integer.valueOf(i), new a());
        }
        a aVar = (a) this.f6966h.get(Integer.valueOf(i));
        if (aVar == null) {
            return;
        }
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    b bVar = aVar.f6971e;
                    bVar.f7022j = i3;
                    bVar.f7023k = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("Left to " + m5674U(i4) + " undefined");
                    }
                    b bVar2 = aVar.f6971e;
                    bVar2.f7023k = i3;
                    bVar2.f7022j = -1;
                }
                aVar.f6971e.f6994H = i5;
                return;
            case 2:
                if (i4 == 1) {
                    b bVar3 = aVar.f6971e;
                    bVar3.f7024l = i3;
                    bVar3.f7025m = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("right to " + m5674U(i4) + " undefined");
                    }
                    b bVar4 = aVar.f6971e;
                    bVar4.f7025m = i3;
                    bVar4.f7024l = -1;
                }
                aVar.f6971e.f6995I = i5;
                return;
            case 3:
                if (i4 == 3) {
                    b bVar5 = aVar.f6971e;
                    bVar5.f7026n = i3;
                    bVar5.f7027o = -1;
                    bVar5.f7030r = -1;
                    bVar5.f7031s = -1;
                    bVar5.f7032t = -1;
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException("right to " + m5674U(i4) + " undefined");
                    }
                    b bVar6 = aVar.f6971e;
                    bVar6.f7027o = i3;
                    bVar6.f7026n = -1;
                    bVar6.f7030r = -1;
                    bVar6.f7031s = -1;
                    bVar6.f7032t = -1;
                }
                aVar.f6971e.f6996J = i5;
                return;
            case 4:
                if (i4 == 4) {
                    b bVar7 = aVar.f6971e;
                    bVar7.f7029q = i3;
                    bVar7.f7028p = -1;
                    bVar7.f7030r = -1;
                    bVar7.f7031s = -1;
                    bVar7.f7032t = -1;
                } else {
                    if (i4 != 3) {
                        throw new IllegalArgumentException("right to " + m5674U(i4) + " undefined");
                    }
                    b bVar8 = aVar.f6971e;
                    bVar8.f7028p = i3;
                    bVar8.f7029q = -1;
                    bVar8.f7030r = -1;
                    bVar8.f7031s = -1;
                    bVar8.f7032t = -1;
                }
                aVar.f6971e.f6997K = i5;
                return;
            case 5:
                if (i4 == 5) {
                    b bVar9 = aVar.f6971e;
                    bVar9.f7030r = i3;
                    bVar9.f7029q = -1;
                    bVar9.f7028p = -1;
                    bVar9.f7026n = -1;
                    bVar9.f7027o = -1;
                    return;
                }
                if (i4 == 3) {
                    b bVar10 = aVar.f6971e;
                    bVar10.f7031s = i3;
                    bVar10.f7029q = -1;
                    bVar10.f7028p = -1;
                    bVar10.f7026n = -1;
                    bVar10.f7027o = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + m5674U(i4) + " undefined");
                }
                b bVar11 = aVar.f6971e;
                bVar11.f7032t = i3;
                bVar11.f7029q = -1;
                bVar11.f7028p = -1;
                bVar11.f7026n = -1;
                bVar11.f7027o = -1;
                return;
            case 6:
                if (i4 == 6) {
                    b bVar12 = aVar.f6971e;
                    bVar12.f7034v = i3;
                    bVar12.f7033u = -1;
                } else {
                    if (i4 != 7) {
                        throw new IllegalArgumentException("right to " + m5674U(i4) + " undefined");
                    }
                    b bVar13 = aVar.f6971e;
                    bVar13.f7033u = i3;
                    bVar13.f7034v = -1;
                }
                aVar.f6971e.f6999M = i5;
                return;
            case 7:
                if (i4 == 7) {
                    b bVar14 = aVar.f6971e;
                    bVar14.f7036x = i3;
                    bVar14.f7035w = -1;
                } else {
                    if (i4 != 6) {
                        throw new IllegalArgumentException("right to " + m5674U(i4) + " undefined");
                    }
                    b bVar15 = aVar.f6971e;
                    bVar15.f7035w = i3;
                    bVar15.f7036x = -1;
                }
                aVar.f6971e.f6998L = i5;
                return;
            default:
                throw new IllegalArgumentException(m5674U(i2) + " to " + m5674U(i4) + " unknown");
        }
    }

    /* renamed from: s */
    public void m5686s(int i, int i2, int i3, float f) {
        b bVar = m5689v(i).f6971e;
        bVar.f6988B = i2;
        bVar.f6989C = i3;
        bVar.f6990D = f;
    }

    /* renamed from: t */
    public final int[] m5687t(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objM5611o;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = t8e.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, OutcomeConstants.OUTCOME_ID, context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objM5611o = ((ConstraintLayout) view.getParent()).m5611o(0, strTrim)) != null && (objM5611o instanceof Integer)) {
                iIntValue = ((Integer) objM5611o).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* renamed from: u */
    public final a m5688u(Context context, AttributeSet attributeSet, boolean z) throws NumberFormatException {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? mbe.ConstraintOverride : mbe.Constraint);
        m5668J(aVar, typedArrayObtainStyledAttributes, z);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: v */
    public final a m5689v(int i) {
        if (!this.f6966h.containsKey(Integer.valueOf(i))) {
            this.f6966h.put(Integer.valueOf(i), new a());
        }
        return (a) this.f6966h.get(Integer.valueOf(i));
    }

    /* renamed from: w */
    public a m5690w(int i) {
        if (this.f6966h.containsKey(Integer.valueOf(i))) {
            return (a) this.f6966h.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: x */
    public int m5691x(int i) {
        return m5689v(i).f6971e.f7017e;
    }

    /* renamed from: y */
    public int[] m5692y() {
        Integer[] numArr = (Integer[]) this.f6966h.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: z */
    public a m5693z(int i) {
        return m5689v(i);
    }
}
