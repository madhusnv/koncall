package p001o;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import java.nio.BufferUnderflowException;
import p001o.hm6;

/* loaded from: classes2.dex */
public class r32 implements u72 {

    /* renamed from: a */
    public final wig f42881a;

    /* renamed from: b */
    public final CaptureResult f42882b;

    public r32(wig wigVar, CaptureResult captureResult) {
        this.f42881a = wigVar;
        this.f42882b = captureResult;
    }

    @Override // p001o.u72
    /* renamed from: a */
    public wig mo46018a() {
        return this.f42881a;
    }

    @Override // p001o.u72
    /* renamed from: b */
    public void mo46191b(hm6.C13999b c13999b) throws NumberFormatException {
        super.mo46191b(c13999b);
        try {
            Integer num = (Integer) this.f42882b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                c13999b.m30803m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            wja.m54638l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l = (Long) this.f42882b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            c13999b.m30796f(l.longValue());
        }
        Float f = (Float) this.f42882b.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            c13999b.m30802l(f.floatValue());
        }
        Integer numValueOf = (Integer) this.f42882b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (((Integer) this.f42882b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            c13999b.m30801k(numValueOf.intValue());
        }
        Float f2 = (Float) this.f42882b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            c13999b.m30798h(f2.floatValue());
        }
        Integer num2 = (Integer) this.f42882b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num2 != null) {
            hm6.EnumC14000c enumC14000c = hm6.EnumC14000c.AUTO;
            if (num2.intValue() == 0) {
                enumC14000c = hm6.EnumC14000c.MANUAL;
            }
            c13999b.m30804n(enumC14000c);
        }
    }

    @Override // p001o.u72
    /* renamed from: c */
    public s72 mo46019c() {
        Integer num = (Integer) this.f42882b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return s72.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return s72.NONE;
        }
        if (iIntValue == 2) {
            return s72.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return s72.FIRED;
        }
        wja.m54629c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return s72.UNKNOWN;
    }

    @Override // p001o.u72
    /* renamed from: d */
    public q72 mo46020d() {
        Integer num = (Integer) this.f42882b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return q72.UNKNOWN;
        }
        switch (num.intValue()) {
        }
        return q72.UNKNOWN;
    }

    @Override // p001o.u72
    /* renamed from: e */
    public CaptureResult mo46192e() {
        return this.f42882b;
    }

    @Override // p001o.u72
    /* renamed from: f */
    public m72 mo46021f() {
        Integer num = (Integer) this.f42882b.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return m72.UNKNOWN;
        }
        int iIntValue = num.intValue();
        return iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? iIntValue != 5 ? m72.UNKNOWN : Build.VERSION.SDK_INT >= 28 ? m72.ON_EXTERNAL_FLASH : m72.UNKNOWN : m72.ON_AUTO_FLASH_REDEYE : m72.ON_ALWAYS_FLASH : m72.ON_AUTO_FLASH : m72.ON : m72.OFF;
    }

    @Override // p001o.u72
    /* renamed from: g */
    public p72 mo46022g() {
        Integer num = (Integer) this.f42882b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return p72.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                wja.m54629c("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return p72.UNKNOWN;
    }

    @Override // p001o.u72
    public long getTimestamp() {
        Long l = (Long) this.f42882b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // p001o.u72
    /* renamed from: h */
    public r72 mo46023h() {
        Integer num = (Integer) this.f42882b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return r72.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return r72.INACTIVE;
        }
        if (iIntValue == 1) {
            return r72.METERING;
        }
        if (iIntValue == 2) {
            return r72.CONVERGED;
        }
        if (iIntValue == 3) {
            return r72.LOCKED;
        }
        wja.m54629c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return r72.UNKNOWN;
    }

    @Override // p001o.u72
    /* renamed from: i */
    public o72 mo46024i() {
        Integer num = (Integer) this.f42882b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return o72.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return o72.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return o72.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                wja.m54629c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return o72.UNKNOWN;
            }
        }
        return o72.OFF;
    }

    @Override // p001o.u72
    /* renamed from: j */
    public n72 mo46025j() {
        Integer num = (Integer) this.f42882b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return n72.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return n72.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return n72.CONVERGED;
            }
            if (iIntValue == 3) {
                return n72.LOCKED;
            }
            if (iIntValue == 4) {
                return n72.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                wja.m54629c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return n72.UNKNOWN;
            }
        }
        return n72.SEARCHING;
    }

    public r32(CaptureResult captureResult) {
        this(wig.m54615b(), captureResult);
    }
}
