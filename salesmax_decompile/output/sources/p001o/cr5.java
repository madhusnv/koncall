package p001o;

import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.impl.C1896a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class cr5 {
    /* renamed from: a */
    public static List m21609a(C1896a c1896a) {
        ArrayList arrayList = new ArrayList();
        if (c1896a.m4697a(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.m4584c())) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        if (c1896a.m4697a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.m4553e())) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        if (c1896a.m4697a(Nexus4AndroidLTargetAspectRatioQuirk.class, Nexus4AndroidLTargetAspectRatioQuirk.m4607d())) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (c1896a.m4697a(ExcludedSupportedSizesQuirk.class, ExcludedSupportedSizesQuirk.m4544p())) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        if (c1896a.m4697a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.m4537c())) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (c1896a.m4697a(PreviewPixelHDRnetQuirk.class, PreviewPixelHDRnetQuirk.m4612c())) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (c1896a.m4697a(StillCaptureFlashStopRepeatingQuirk.class, StillCaptureFlashStopRepeatingQuirk.m4624c())) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (c1896a.m4697a(ExtraSupportedSurfaceCombinationsQuirk.class, ExtraSupportedSurfaceCombinationsQuirk.m4562h())) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (c1896a.m4697a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.m4568d())) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (c1896a.m4697a(RepeatingStreamConstraintForVideoRecordingQuirk.class, RepeatingStreamConstraintForVideoRecordingQuirk.m4621d())) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (c1896a.m4697a(TextureViewIsClosedQuirk.class, TextureViewIsClosedQuirk.m4627c())) {
            arrayList.add(new TextureViewIsClosedQuirk());
        }
        if (c1896a.m4697a(CaptureSessionOnClosedNotCalledQuirk.class, CaptureSessionOnClosedNotCalledQuirk.m4533c())) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        if (c1896a.m4697a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.m4634c())) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        if (c1896a.m4697a(ZslDisablerQuirk.class, ZslDisablerQuirk.m4645f())) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (c1896a.m4697a(ExtraSupportedOutputSizeQuirk.class, ExtraSupportedOutputSizeQuirk.m4556f())) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        if (c1896a.m4697a(InvalidVideoProfilesQuirk.class, InvalidVideoProfilesQuirk.m4601p())) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (c1896a.m4697a(Preview3AThreadCrashQuirk.class, Preview3AThreadCrashQuirk.m4609c())) {
            arrayList.add(new Preview3AThreadCrashQuirk());
        }
        if (c1896a.m4697a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.m4622d())) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if (c1896a.m4697a(CaptureSessionShouldUseMrirQuirk.class, CaptureSessionShouldUseMrirQuirk.m4534c())) {
            arrayList.add(new CaptureSessionShouldUseMrirQuirk());
        }
        return arrayList;
    }
}
