package p001o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;

/* loaded from: classes5.dex */
public final class q31 implements Configurator {

    /* renamed from: a */
    public static final Configurator f41183a = new q31();

    /* renamed from: o.q31$a */
    public static final class C16275a implements ObjectEncoder {

        /* renamed from: a */
        public static final C16275a f41184a = new C16275a();

        /* renamed from: b */
        public static final FieldDescriptor f41185b = FieldDescriptor.builder("window").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f41186c = FieldDescriptor.builder("logSourceMetrics").withProperty(AtProtobuf.builder().tag(2).build()).build();

        /* renamed from: d */
        public static final FieldDescriptor f41187d = FieldDescriptor.builder("globalMetrics").withProperty(AtProtobuf.builder().tag(3).build()).build();

        /* renamed from: e */
        public static final FieldDescriptor f41188e = FieldDescriptor.builder("appNamespace").withProperty(AtProtobuf.builder().tag(4).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(bb3 bb3Var, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f41185b, bb3Var.m18525d());
            objectEncoderContext.add(f41186c, bb3Var.m18524c());
            objectEncoderContext.add(f41187d, bb3Var.m18523b());
            objectEncoderContext.add(f41188e, bb3Var.m18522a());
        }
    }

    /* renamed from: o.q31$b */
    public static final class C16276b implements ObjectEncoder {

        /* renamed from: a */
        public static final C16276b f41189a = new C16276b();

        /* renamed from: b */
        public static final FieldDescriptor f41190b = FieldDescriptor.builder("storageMetrics").withProperty(AtProtobuf.builder().tag(1).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(ht7 ht7Var, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f41190b, ht7Var.m31114a());
        }
    }

    /* renamed from: o.q31$c */
    public static final class C16277c implements ObjectEncoder {

        /* renamed from: a */
        public static final C16277c f41191a = new C16277c();

        /* renamed from: b */
        public static final FieldDescriptor f41192b = FieldDescriptor.builder("eventsDroppedCount").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f41193c = FieldDescriptor.builder("reason").withProperty(AtProtobuf.builder().tag(3).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(xia xiaVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f41192b, xiaVar.m56359a());
            objectEncoderContext.add(f41193c, xiaVar.m56360b());
        }
    }

    /* renamed from: o.q31$d */
    public static final class C16278d implements ObjectEncoder {

        /* renamed from: a */
        public static final C16278d f41194a = new C16278d();

        /* renamed from: b */
        public static final FieldDescriptor f41195b = FieldDescriptor.builder("logSource").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f41196c = FieldDescriptor.builder("logEventDropped").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(kja kjaVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f41195b, kjaVar.m35781b());
            objectEncoderContext.add(f41196c, kjaVar.m35780a());
        }
    }

    /* renamed from: o.q31$e */
    public static final class C16279e implements ObjectEncoder {

        /* renamed from: a */
        public static final C16279e f41197a = new C16279e();

        /* renamed from: b */
        public static final FieldDescriptor f41198b = FieldDescriptor.of("clientMetrics");

        /* renamed from: a */
        public void m44759a(s1e s1eVar, ObjectEncoderContext objectEncoderContext) {
            throw null;
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            tq.m50332a(obj);
            m44759a(null, objectEncoderContext);
        }
    }

    /* renamed from: o.q31$f */
    public static final class C16280f implements ObjectEncoder {

        /* renamed from: a */
        public static final C16280f f41199a = new C16280f();

        /* renamed from: b */
        public static final FieldDescriptor f41200b = FieldDescriptor.builder("currentCacheSizeBytes").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f41201c = FieldDescriptor.builder("maxCacheSizeBytes").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(j6g j6gVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f41200b, j6gVar.m33298a());
            objectEncoderContext.add(f41201c, j6gVar.m33299b());
        }
    }

    /* renamed from: o.q31$g */
    public static final class C16281g implements ObjectEncoder {

        /* renamed from: a */
        public static final C16281g f41202a = new C16281g();

        /* renamed from: b */
        public static final FieldDescriptor f41203b = FieldDescriptor.builder("startMs").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f41204c = FieldDescriptor.builder("endMs").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(imh imhVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f41203b, imhVar.m32420b());
            objectEncoderContext.add(f41204c, imhVar.m32419a());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig) {
        encoderConfig.registerEncoder(s1e.class, C16279e.f41197a);
        encoderConfig.registerEncoder(bb3.class, C16275a.f41184a);
        encoderConfig.registerEncoder(imh.class, C16281g.f41202a);
        encoderConfig.registerEncoder(kja.class, C16278d.f41194a);
        encoderConfig.registerEncoder(xia.class, C16277c.f41191a);
        encoderConfig.registerEncoder(ht7.class, C16276b.f41189a);
        encoderConfig.registerEncoder(j6g.class, C16280f.f41199a);
    }
}
