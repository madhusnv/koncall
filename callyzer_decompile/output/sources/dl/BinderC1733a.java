package dl;

import android.content.Context;
import android.os.Parcel;
import cg.BinderC0969b;
import cg.InterfaceC0968a;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractBinderC1330t;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1318h;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1331u;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1332v;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1334x;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.c0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.f0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jl.C3782a;
import jl.C3795n;
import sf.AbstractC6840z;
import wh.C8036a;
import wh.C8037b;
import wh.C8038c;
import wh.C8039d;
import wh.C8040e;
import wh.C8041f;
import wh.C8042g;
import wh.C8043h;
import wh.C8044i;
import wh.C8045j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dl.a */
/* loaded from: classes.dex */
public final class BinderC1733a extends AbstractBinderC1330t implements InterfaceC1334x {

    /* renamed from: h */
    public static final int[] f8396h = {5, 7, 7, 7, 5, 5};

    /* renamed from: i */
    public static final double[][] f8397i = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* renamed from: e */
    public final Context f8398e;

    /* renamed from: f */
    public final C1331u f8399f;

    /* renamed from: g */
    public BarhopperV3 f8400g;

    public BinderC1733a(Context context, C1331u c1331u) {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
        this.f8398e = context;
        this.f8399f = c1331u;
    }

    /* renamed from: g */
    public static C1318h m5431g(C3795n c3795n, String str, String str2) {
        if (c3795n == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int iM8356s = c3795n.m8356s();
        int iM8354q = c3795n.m8354q();
        int iM8351n = c3795n.m8351n();
        int iM8352o = c3795n.m8352o();
        int iM8353p = c3795n.m8353p();
        int iM8355r = c3795n.m8355r();
        return new C1318h(matcher.find() ? matcher.group(1) : null, iM8356s, iM8354q, iM8351n, iM8352o, c3795n.m8357u(), iM8353p, iM8355r);
    }

    /* renamed from: O */
    public final C3782a m5432O(ByteBuffer byteBuffer, f0 f0Var, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = this.f8400g;
        AbstractC6840z.m13036g(barhopperV3);
        AbstractC6840z.m13036g(byteBuffer);
        if (byteBuffer.isDirect()) {
            return barhopperV3.m4021j(f0Var.f6526b, f0Var.f6527c, byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.m4022n(f0Var.f6526b, f0Var.f6527c, byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.m4022n(f0Var.f6526b, f0Var.f6527c, bArr, recognitionOptions);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* renamed from: P */
    public final java.util.ArrayList m5433P(cg.InterfaceC0968a r57, com.google.android.gms.internal.mlkit_vision_barcode_bundled.f0 r58, com.google.android.libraries.barhopper.RecognitionOptions r59) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.BinderC1733a.m5433P(cg.a, com.google.android.gms.internal.mlkit_vision_barcode_bundled.f0, com.google.android.libraries.barhopper.RecognitionOptions):java.util.ArrayList");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractBinderC1330t
    /* renamed from: d */
    public final boolean mo3969d(int i10, Parcel parcel, Parcel parcel2) throws IOException {
        if (i10 == 1) {
            m5434f();
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 2) {
            BarhopperV3 barhopperV3 = this.f8400g;
            if (barhopperV3 != null) {
                barhopperV3.close();
                this.f8400g = null;
            }
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 3) {
            InterfaceC0968a interfaceC0968aM2726R = BinderC0969b.m2726R(parcel.readStrongBinder());
            f0 f0Var = (f0) e0.m3829a(parcel, f0.CREATOR);
            e0.m3830b(parcel);
            RecognitionOptions recognitionOptions = new RecognitionOptions();
            C1331u c1331u = this.f8399f;
            recognitionOptions.m4028a(c1331u.f6667a);
            recognitionOptions.m4033f(c1331u.f6668b);
            recognitionOptions.m4029b();
            recognitionOptions.m4030c();
            ArrayList arrayListM5433P = m5433P(interfaceC0968aM2726R, f0Var, recognitionOptions);
            parcel2.writeNoException();
            parcel2.writeTypedList(arrayListM5433P);
            return true;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                return false;
            }
            e0.m3830b(parcel);
            m5434f();
            parcel2.writeNoException();
            return true;
        }
        InterfaceC0968a interfaceC0968aM2726R2 = BinderC0969b.m2726R(parcel.readStrongBinder());
        f0 f0Var2 = (f0) e0.m3829a(parcel, f0.CREATOR);
        C1332v c1332v = (C1332v) e0.m3829a(parcel, C1332v.CREATOR);
        e0.m3830b(parcel);
        RecognitionOptions recognitionOptions2 = new RecognitionOptions();
        C1331u c1331u2 = this.f8399f;
        recognitionOptions2.m4028a(c1331u2.f6667a);
        recognitionOptions2.m4033f(c1331u2.f6668b);
        recognitionOptions2.m4029b();
        recognitionOptions2.m4030c();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.m4024a(c1332v.f6672a.f6511a);
        c0 c0Var = c1332v.f6672a;
        multiScaleDecodingOptions.m4025b(c0Var.f6512b);
        multiScaleDecodingOptions.m4026c(c0Var.f6513c);
        recognitionOptions2.m4031d(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.m4027a(c0Var.f6511a);
        recognitionOptions2.m4032e(multiScaleDetectionOptions);
        recognitionOptions2.m4034g(c1332v.f6674c);
        ArrayList arrayListM5433P2 = m5433P(interfaceC0968aM2726R2, f0Var2, recognitionOptions2);
        parcel2.writeNoException();
        parcel2.writeTypedList(arrayListM5433P2);
        return true;
    }

    /* renamed from: f */
    public final void m5434f() throws IOException {
        Context context = this.f8398e;
        if (this.f8400g != null) {
            return;
        }
        BarhopperV3 barhopperV3 = new BarhopperV3();
        System.loadLibrary("barhopper_v3");
        this.f8400g = barhopperV3;
        C8043h c8043hM15182n = C8044i.m15182n();
        C8041f c8041fM15180n = C8042g.m15180n();
        int i10 = 16;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            C8039d c8039dM15175n = C8040e.m15175n();
            c8039dM15175n.m3808e();
            C8040e.m15179r((C8040e) c8039dM15175n.f6475b, i10);
            c8039dM15175n.m3808e();
            C8040e.m15176o((C8040e) c8039dM15175n.f6475b, i10);
            for (int i13 = 0; i13 < f8396h[i12]; i13++) {
                double[] dArr = f8397i[i11];
                double d2 = dArr[0] * 320.0d;
                float fSqrt = (float) Math.sqrt(dArr[1]);
                float f6 = (float) d2;
                c8039dM15175n.m3808e();
                C8040e.m15177p((C8040e) c8039dM15175n.f6475b, f6 / fSqrt);
                c8039dM15175n.m3808e();
                C8040e.m15178q((C8040e) c8039dM15175n.f6475b, f6 * fSqrt);
                i11++;
            }
            i10 += i10;
            c8041fM15180n.m3808e();
            C8042g.m15181o((C8042g) c8041fM15180n.f6475b, (C8040e) c8039dM15175n.m3805b());
        }
        c8043hM15182n.m3808e();
        C8044i.m15183o((C8044i) c8043hM15182n.f6475b, (C8042g) c8041fM15180n.m3805b());
        try {
            InputStream inputStreamOpen = context.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream inputStreamOpen2 = context.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream inputStreamOpen3 = context.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV32 = this.f8400g;
                        AbstractC6840z.m13036g(barhopperV32);
                        C8045j c8045jM15169n = C8036a.m15169n();
                        r0 r0VarM3948x = r0.m3948x(inputStreamOpen);
                        c8043hM15182n.m3808e();
                        C8044i.m15184p((C8044i) c8043hM15182n.f6475b, r0VarM3948x);
                        c8045jM15169n.m3808e();
                        C8036a.m15170o((C8036a) c8045jM15169n.f6475b, (C8044i) c8043hM15182n.m3805b());
                        C8037b c8037bM15172n = C8038c.m15172n();
                        r0 r0VarM3948x2 = r0.m3948x(inputStreamOpen2);
                        c8037bM15172n.m3808e();
                        C8038c.m15174p((C8038c) c8037bM15172n.f6475b, r0VarM3948x2);
                        r0 r0VarM3948x3 = r0.m3948x(inputStreamOpen3);
                        c8037bM15172n.m3808e();
                        C8038c.m15173o((C8038c) c8037bM15172n.f6475b, r0VarM3948x3);
                        c8045jM15169n.m3808e();
                        C8036a.m15171p((C8036a) c8045jM15169n.f6475b, (C8038c) c8037bM15172n.m3805b());
                        barhopperV32.m4020h((C8036a) c8045jM15169n.m3805b());
                        if (inputStreamOpen3 != null) {
                            inputStreamOpen3.close();
                        }
                        if (inputStreamOpen2 != null) {
                            inputStreamOpen2.close();
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Failed to open Barcode models", e2);
        }
    }
}
