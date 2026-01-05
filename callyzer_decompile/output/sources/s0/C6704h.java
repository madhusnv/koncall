package s0;

import android.opengl.GLES20;
import c0.a0;
import java.nio.Buffer;
import java.util.Locale;
import og.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s0.h */
/* loaded from: classes.dex */
public final class C6704h extends AbstractC6703g {

    /* renamed from: e */
    public final int f32024e;

    /* renamed from: f */
    public final int f32025f;

    /* renamed from: g */
    public final int f32026g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6704h(a0 a0Var, C6700d c6700d) {
        String str;
        String str2 = a0Var.m2138a() ? AbstractC6705i.f32030d : AbstractC6705i.f32029c;
        try {
            switch (c6700d.f32019a) {
                case 0:
                    Locale locale = Locale.US;
                    str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
                    break;
                case 1:
                    Locale locale2 = Locale.US;
                    str = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
                    break;
                default:
                    Locale locale3 = Locale.US;
                    str = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
                    break;
            }
            if (!str.contains("vTextureCoord") || !str.contains("sTexture")) {
                throw new IllegalArgumentException("Invalid fragment shader");
            }
            super(str2, str);
            this.f32024e = -1;
            this.f32025f = -1;
            this.f32026g = -1;
            m12830a();
            int i10 = this.f32020a;
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i10, "sTexture");
            this.f32024e = iGlGetUniformLocation;
            AbstractC6705i.m12836e(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i10, "aTextureCoord");
            this.f32026g = iGlGetAttribLocation;
            AbstractC6705i.m12836e(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i10, "uTexMatrix");
            this.f32025f = iGlGetUniformLocation2;
            AbstractC6705i.m12836e(iGlGetUniformLocation2, "uTexMatrix");
        } catch (Throwable th2) {
            if (!(th2 instanceof IllegalArgumentException)) {
                throw new IllegalArgumentException("Unable retrieve fragment shader source", th2);
            }
            throw th2;
        }
    }

    @Override // s0.AbstractC6703g
    /* renamed from: b */
    public final void mo12831b() {
        super.mo12831b();
        GLES20.glUniform1i(this.f32024e, 0);
        GLES20.glEnableVertexAttribArray(this.f32026g);
        AbstractC6705i.m12833b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f32026g, 2, 5126, false, 0, (Buffer) AbstractC6705i.f32035i);
        AbstractC6705i.m12833b("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6704h(a0 a0Var, EnumC6702f enumC6702f) {
        C6700d c6700d;
        if (a0Var.m2138a()) {
            y0.m11051a("No default sampler shader available for" + enumC6702f, enumC6702f != EnumC6702f.UNKNOWN);
            if (enumC6702f == EnumC6702f.YUV) {
                c6700d = AbstractC6705i.f32033g;
            } else {
                c6700d = AbstractC6705i.f32032f;
            }
        } else {
            c6700d = AbstractC6705i.f32031e;
        }
        this(a0Var, c6700d);
    }
}
