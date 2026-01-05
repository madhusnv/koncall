package p001o;

import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import androidx.camera.core.impl.C1896a;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class ka2 {
    /* renamed from: a */
    public static l5e m35219a(String str, s82 s82Var) {
        C1896a c1896aM35010a = k5e.m35009b().m35010a();
        ArrayList arrayList = new ArrayList();
        if (c1896aM35010a.m4697a(AeFpsRangeLegacyQuirk.class, AeFpsRangeLegacyQuirk.m4521e(s82Var))) {
            arrayList.add(new AeFpsRangeLegacyQuirk(s82Var));
        }
        if (c1896aM35010a.m4697a(AspectRatioLegacyApi21Quirk.class, AspectRatioLegacyApi21Quirk.m4526d(s82Var))) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (c1896aM35010a.m4697a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.m4603c(s82Var))) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (c1896aM35010a.m4697a(JpegCaptureDownsizingQuirk.class, JpegCaptureDownsizingQuirk.m4602c(s82Var))) {
            arrayList.add(new JpegCaptureDownsizingQuirk());
        }
        if (c1896aM35010a.m4697a(CamcorderProfileResolutionQuirk.class, CamcorderProfileResolutionQuirk.m4528c(s82Var))) {
            arrayList.add(new CamcorderProfileResolutionQuirk(s82Var));
        }
        if (c1896aM35010a.m4697a(CaptureNoResponseQuirk.class, CaptureNoResponseQuirk.m4532c(s82Var))) {
            arrayList.add(new CaptureNoResponseQuirk());
        }
        if (c1896aM35010a.m4697a(LegacyCameraOutputConfigNullPointerQuirk.class, LegacyCameraOutputConfigNullPointerQuirk.m4604c(s82Var))) {
            arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
        }
        if (c1896aM35010a.m4697a(LegacyCameraSurfaceCleanupQuirk.class, LegacyCameraSurfaceCleanupQuirk.m4606d(s82Var))) {
            arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
        }
        if (c1896aM35010a.m4697a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.m4585c(s82Var))) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        if (c1896aM35010a.m4697a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.m4529c(s82Var))) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (c1896aM35010a.m4697a(YuvImageOnePixelShiftQuirk.class, YuvImageOnePixelShiftQuirk.m4641i(s82Var))) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (c1896aM35010a.m4697a(FlashTooSlowQuirk.class, FlashTooSlowQuirk.m4570d(s82Var))) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (c1896aM35010a.m4697a(AfRegionFlipHorizontallyQuirk.class, AfRegionFlipHorizontallyQuirk.m4525c(s82Var))) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        if (c1896aM35010a.m4697a(ConfigureSurfaceToSecondarySessionFailQuirk.class, ConfigureSurfaceToSecondarySessionFailQuirk.m4536c(s82Var))) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (c1896aM35010a.m4697a(PreviewOrientationIncorrectQuirk.class, PreviewOrientationIncorrectQuirk.m4611c(s82Var))) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        if (c1896aM35010a.m4697a(CaptureSessionStuckQuirk.class, CaptureSessionStuckQuirk.m4535c(s82Var))) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        if (c1896aM35010a.m4697a(ImageCaptureFlashNotFireQuirk.class, ImageCaptureFlashNotFireQuirk.m4583c(s82Var))) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        if (c1896aM35010a.m4697a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.m4586c(s82Var))) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (c1896aM35010a.m4697a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.m4571c(s82Var))) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        if (c1896aM35010a.m4697a(IncorrectCaptureStateQuirk.class, IncorrectCaptureStateQuirk.m4587c(s82Var))) {
            arrayList.add(new IncorrectCaptureStateQuirk());
        }
        if (c1896aM35010a.m4697a(TorchFlashRequiredFor3aUpdateQuirk.class, TorchFlashRequiredFor3aUpdateQuirk.m4632h(s82Var))) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(s82Var));
        }
        if (c1896aM35010a.m4697a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, PreviewStretchWhenVideoCaptureIsBoundQuirk.m4619i())) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (c1896aM35010a.m4697a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, PreviewDelayWhenVideoCaptureIsBoundQuirk.m4610c())) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (c1896aM35010a.m4697a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.m4582j())) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (c1896aM35010a.m4697a(TemporalNoiseQuirk.class, TemporalNoiseQuirk.m4626d(s82Var))) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (c1896aM35010a.m4697a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.m4574e())) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        l5e l5eVar = new l5e(arrayList);
        wja.m54627a("CameraQuirks", "camera2 CameraQuirks = " + l5e.m36592d(l5eVar));
        return l5eVar;
    }
}
