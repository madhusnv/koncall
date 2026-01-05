package p001o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.InterfaceC2218o;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import p001o.ad8;
import p001o.kb5;
import p001o.m1b;

/* loaded from: classes2.dex */
public class ig5 implements oke {

    /* renamed from: a */
    public final Context f28627a;

    /* renamed from: b */
    public final af5 f28628b;

    /* renamed from: e */
    public boolean f28631e;

    /* renamed from: g */
    public boolean f28633g;

    /* renamed from: h */
    public boolean f28634h;

    /* renamed from: c */
    public int f28629c = 0;

    /* renamed from: d */
    public long f28630d = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;

    /* renamed from: f */
    public a2b f28632f = a2b.f14065a;

    public ig5(Context context) {
        this.f28627a = context;
        this.f28628b = new af5(context);
    }

    @Override // p001o.oke
    /* renamed from: a */
    public InterfaceC2218o[] mo32095a(Handler handler, yui yuiVar, jz0 jz0Var, jih jihVar, vdb vdbVar) {
        ArrayList arrayList = new ArrayList();
        m32103i(this.f28627a, this.f28629c, this.f28632f, this.f28631e, handler, yuiVar, this.f28630d, arrayList);
        kz0 kz0VarM32097c = m32097c(this.f28627a, this.f28633g, this.f28634h);
        if (kz0VarM32097c != null) {
            m32096b(this.f28627a, this.f28629c, this.f28632f, this.f28631e, kz0VarM32097c, handler, jz0Var, arrayList);
        }
        m32102h(this.f28627a, jihVar, handler.getLooper(), this.f28629c, arrayList);
        m32100f(this.f28627a, vdbVar, handler.getLooper(), this.f28629c, arrayList);
        m32098d(this.f28627a, this.f28629c, arrayList);
        m32099e(arrayList);
        m32101g(this.f28627a, handler, this.f28629c, arrayList);
        return (InterfaceC2218o[]) arrayList.toArray(new InterfaceC2218o[0]);
    }

    /* renamed from: b */
    public void m32096b(Context context, int i, a2b a2bVar, boolean z, kz0 kz0Var, Handler handler, jz0 jz0Var, ArrayList arrayList) {
        int i2;
        kz0 kz0Var2;
        Handler handler2;
        String str;
        int i3;
        arrayList.add(new n1b(context, m32104j(), a2bVar, z, handler, jz0Var, kz0Var));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (InterfaceC2218o) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class).newInstance(context));
                    ria.m46822f("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                    try {
                        kz0Var2 = kz0Var;
                        handler2 = handler;
                        str = "DefaultRenderersFactory";
                        try {
                            i3 = i2 + 1;
                            try {
                                arrayList.add(i2, (InterfaceC2218o) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, jz0.class, kz0.class).newInstance(handler2, jz0Var, kz0Var2));
                                ria.m46822f(str, "Loaded LibopusAudioRenderer.");
                            } catch (ClassNotFoundException unused2) {
                                i2 = i3;
                                i3 = i2;
                                int i4 = i3 + 1;
                                try {
                                    arrayList.add(i3, (InterfaceC2218o) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, jz0.class, kz0.class).newInstance(handler2, jz0Var, kz0Var2));
                                    ria.m46822f(str, "Loaded LibflacAudioRenderer.");
                                } catch (ClassNotFoundException unused3) {
                                    i3 = i4;
                                    i4 = i3;
                                    arrayList.add(i4, (InterfaceC2218o) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, jz0.class, kz0.class).newInstance(handler2, jz0Var, kz0Var2));
                                    ria.m46822f(str, "Loaded FfmpegAudioRenderer.");
                                }
                                arrayList.add(i4, (InterfaceC2218o) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, jz0.class, kz0.class).newInstance(handler2, jz0Var, kz0Var2));
                                ria.m46822f(str, "Loaded FfmpegAudioRenderer.");
                            }
                        } catch (ClassNotFoundException unused4) {
                        }
                        try {
                            int i42 = i3 + 1;
                            arrayList.add(i3, (InterfaceC2218o) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, jz0.class, kz0.class).newInstance(handler2, jz0Var, kz0Var2));
                            ria.m46822f(str, "Loaded LibflacAudioRenderer.");
                            arrayList.add(i42, (InterfaceC2218o) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, jz0.class, kz0.class).newInstance(handler2, jz0Var, kz0Var2));
                            ria.m46822f(str, "Loaded FfmpegAudioRenderer.");
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating FLAC extension", e);
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating Opus extension", e2);
                    }
                }
            } catch (ClassNotFoundException unused5) {
            }
            try {
                kz0Var2 = kz0Var;
                handler2 = handler;
                str = "DefaultRenderersFactory";
                i3 = i2 + 1;
                arrayList.add(i2, (InterfaceC2218o) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, jz0.class, kz0.class).newInstance(handler2, jz0Var, kz0Var2));
                ria.m46822f(str, "Loaded LibopusAudioRenderer.");
            } catch (ClassNotFoundException unused6) {
                kz0Var2 = kz0Var;
                handler2 = handler;
                str = "DefaultRenderersFactory";
            }
            try {
                int i422 = i3 + 1;
                arrayList.add(i3, (InterfaceC2218o) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, jz0.class, kz0.class).newInstance(handler2, jz0Var, kz0Var2));
                ria.m46822f(str, "Loaded LibflacAudioRenderer.");
            } catch (ClassNotFoundException unused7) {
            }
            try {
                arrayList.add(i422, (InterfaceC2218o) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, jz0.class, kz0.class).newInstance(handler2, jz0Var, kz0Var2));
                ria.m46822f(str, "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused8) {
            } catch (Exception e3) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e3);
            }
        } catch (Exception e4) {
            throw new RuntimeException("Error instantiating MIDI extension", e4);
        }
    }

    /* renamed from: c */
    public kz0 m32097c(Context context, boolean z, boolean z2) {
        return new kb5.C14768f(context).m35316k(z).m35315j(z2).m35314i();
    }

    /* renamed from: d */
    public void m32098d(Context context, int i, ArrayList arrayList) {
        arrayList.add(new ga2());
    }

    /* renamed from: e */
    public void m32099e(ArrayList arrayList) {
        arrayList.add(new ce8(ad8.InterfaceC12144a.f14527a, null));
    }

    /* renamed from: f */
    public void m32100f(Context context, vdb vdbVar, Looper looper, int i, ArrayList arrayList) {
        arrayList.add(new wdb(vdbVar, looper));
    }

    /* renamed from: g */
    public void m32101g(Context context, Handler handler, int i, ArrayList arrayList) {
    }

    /* renamed from: h */
    public void m32102h(Context context, jih jihVar, Looper looper, int i, ArrayList arrayList) {
        arrayList.add(new mih(jihVar, looper));
    }

    /* renamed from: i */
    public void m32103i(Context context, int i, a2b a2bVar, boolean z, Handler handler, yui yuiVar, long j, ArrayList arrayList) {
        int i2;
        arrayList.add(new l2b(context, m32104j(), a2bVar, j, z, handler, yuiVar, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (InterfaceC2218o) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, yui.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, yuiVar, 50));
                    ria.m46822f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                    try {
                        int i3 = i2 + 1;
                        try {
                            arrayList.add(i2, (InterfaceC2218o) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, yui.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, yuiVar, 50));
                            ria.m46822f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                        } catch (ClassNotFoundException unused2) {
                            i2 = i3;
                            i3 = i2;
                            arrayList.add(i3, (InterfaceC2218o) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, yui.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, yuiVar, 50));
                            ria.m46822f("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                        }
                        arrayList.add(i3, (InterfaceC2218o) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, yui.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, yuiVar, 50));
                        ria.m46822f("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating AV1 extension", e);
                    }
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating VP9 extension", e2);
            }
        } catch (ClassNotFoundException unused3) {
        }
        try {
            int i32 = i2 + 1;
            arrayList.add(i2, (InterfaceC2218o) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, yui.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, yuiVar, 50));
            ria.m46822f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused4) {
        }
        try {
            arrayList.add(i32, (InterfaceC2218o) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, yui.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, yuiVar, 50));
            ria.m46822f("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
        } catch (ClassNotFoundException unused5) {
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating FFmpeg extension", e3);
        }
    }

    /* renamed from: j */
    public m1b.InterfaceC15199b m32104j() {
        return this.f28628b;
    }
}
