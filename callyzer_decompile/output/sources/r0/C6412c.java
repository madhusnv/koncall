package r0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import b6.C0601b;
import c0.C0833z;
import c0.a0;
import com.skydoves.balloon.internals.DefinitionKt;
import h1.g2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import og.u1;
import og.y0;
import q0.C6070k;
import s0.AbstractC6703g;
import s0.AbstractC6705i;
import s0.C6697a;
import s0.C6699c;
import s0.C6704h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r0.c */
/* loaded from: classes.dex */
public final class C6412c extends g2 {

    /* renamed from: p */
    public int f30924p = -1;

    /* renamed from: q */
    public int f30925q = -1;

    /* renamed from: r */
    public final C0833z f30926r;

    /* renamed from: s */
    public final C0833z f30927s;

    public C6412c(C0833z c0833z, C0833z c0833z2) {
        this.f30926r = c0833z;
        this.f30927s = c0833z2;
    }

    @Override // h1.g2
    /* renamed from: h */
    public final C6697a mo6818h(a0 a0Var) {
        Map map = Collections.EMPTY_MAP;
        C6697a c6697aMo6818h = super.mo6818h(a0Var);
        this.f30924p = AbstractC6705i.m12838g();
        this.f30925q = AbstractC6705i.m12838g();
        return c6697aMo6818h;
    }

    /* renamed from: r */
    public final void m12419r(long j6, Surface surface, C6070k c6070k, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        AbstractC6705i.m12835d((AtomicBoolean) this.f15432c, true);
        AbstractC6705i.m12834c((Thread) this.f15434e);
        HashMap map = (HashMap) this.f15433d;
        y0.m11056f("The surface is not registered.", map.containsKey(surface));
        C6699c c6699cM6813c = (C6699c) map.get(surface);
        Objects.requireNonNull(c6699cM6813c);
        if (c6699cM6813c == AbstractC6705i.f32036j) {
            c6699cM6813c = m6813c(surface);
            if (c6699cM6813c == null) {
                return;
            } else {
                map.put(surface, c6699cM6813c);
            }
        }
        C6699c c6699c = c6699cM6813c;
        EGLSurface eGLSurface = c6699c.f32016a;
        if (surface != ((Surface) this.f15439k)) {
            m6820j(eGLSurface);
            this.f15439k = surface;
        }
        GLES20.glClearColor(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 1.0f);
        GLES20.glClear(16384);
        m12420s(c6699c, c6070k, surfaceTexture, this.f30926r, this.f30924p);
        m12420s(c6699c, c6070k, surfaceTexture2, this.f30927s, this.f30925q);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f15435f, eGLSurface, j6);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f15435f, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        u1.m10951j("DualOpenGlRenderer");
        m6823o(surface, false);
    }

    /* renamed from: s */
    public final void m12420s(C6699c c6699c, C6070k c6070k, SurfaceTexture surfaceTexture, C0833z c0833z, int i10) {
        m6825q(i10);
        int i11 = c6699c.f32017b;
        int i12 = c6699c.f32018c;
        GLES20.glViewport(0, 0, i11, i12);
        GLES20.glScissor(0, 0, i11, i12);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, c6070k.f29612e, 0);
        AbstractC6703g abstractC6703g = (AbstractC6703g) this.f15441m;
        abstractC6703g.getClass();
        if (abstractC6703g instanceof C6704h) {
            GLES20.glUniformMatrix4fv(((C6704h) abstractC6703g).f32025f, 1, false, fArr2, 0);
            AbstractC6705i.m12833b("glUniformMatrix4fv");
        }
        C0601b c0601b = (C0601b) c0833z.f5292c;
        Object obj = c0601b.f3985a;
        Object obj2 = c0601b.f3986b;
        Size size = new Size((int) (((Float) c0601b.f3985a).floatValue() * i11), (int) (((Float) obj2).floatValue() * i12));
        Size size2 = new Size(i11, i12);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        C0601b c0601b2 = (C0601b) c0833z.f5291b;
        if (((Float) obj).floatValue() != DefinitionKt.NO_Float_VALUE || ((Float) obj2).floatValue() != DefinitionKt.NO_Float_VALUE) {
            Matrix.translateM(fArr4, 0, ((Float) c0601b2.f3985a).floatValue() / ((Float) obj).floatValue(), ((Float) c0601b2.f3986b).floatValue() / ((Float) obj2).floatValue(), DefinitionKt.NO_Float_VALUE);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(abstractC6703g.f32021b, 1, false, fArr5, 0);
        AbstractC6705i.m12833b("glUniformMatrix4fv");
        GLES20.glUniform1f(abstractC6703g.f32022c, 1.0f);
        AbstractC6705i.m12833b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC6705i.m12833b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
