package androidx.media;

import p001o.vti;

/* loaded from: classes2.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(vti vtiVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f7782a = vtiVar.m53441p(audioAttributesImplBase.f7782a, 1);
        audioAttributesImplBase.f7783b = vtiVar.m53441p(audioAttributesImplBase.f7783b, 2);
        audioAttributesImplBase.f7784c = vtiVar.m53441p(audioAttributesImplBase.f7784c, 3);
        audioAttributesImplBase.f7785d = vtiVar.m53441p(audioAttributesImplBase.f7785d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, vti vtiVar) {
        vtiVar.m53449x(false, false);
        vtiVar.m53417F(audioAttributesImplBase.f7782a, 1);
        vtiVar.m53417F(audioAttributesImplBase.f7783b, 2);
        vtiVar.m53417F(audioAttributesImplBase.f7784c, 3);
        vtiVar.m53417F(audioAttributesImplBase.f7785d, 4);
    }
}
