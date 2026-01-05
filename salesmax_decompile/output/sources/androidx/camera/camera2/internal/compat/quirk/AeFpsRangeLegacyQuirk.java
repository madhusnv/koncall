package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import p001o.j5e;
import p001o.s82;

/* loaded from: classes2.dex */
public class AeFpsRangeLegacyQuirk implements j5e {

    /* renamed from: a */
    public final Range f6057a;

    public AeFpsRangeLegacyQuirk(s82 s82Var) {
        this.f6057a = m4524f((Range[]) s82Var.m47965a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    /* renamed from: e */
    public static boolean m4521e(s82 s82Var) {
        Integer num = (Integer) s82Var.m47965a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    /* renamed from: c */
    public final Range m4522c(Range range) {
        int iIntValue = ((Integer) range.getUpper()).intValue();
        int iIntValue2 = ((Integer) range.getLower()).intValue();
        if (((Integer) range.getUpper()).intValue() >= 1000) {
            iIntValue = ((Integer) range.getUpper()).intValue() / 1000;
        }
        if (((Integer) range.getLower()).intValue() >= 1000) {
            iIntValue2 = ((Integer) range.getLower()).intValue() / 1000;
        }
        return new Range(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
    }

    /* renamed from: d */
    public Range m4523d() {
        return this.f6057a;
    }

    /* renamed from: f */
    public final Range m4524f(Range[] rangeArr) {
        Range range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range rangeM4522c = m4522c(range2);
                if (((Integer) rangeM4522c.getUpper()).intValue() == 30 && (range == null || ((Integer) rangeM4522c.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = rangeM4522c;
                }
            }
        }
        return range;
    }
}
