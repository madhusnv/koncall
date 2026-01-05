package p001o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes5.dex */
public final class x01 implements Configurator {

    /* renamed from: a */
    public static final Configurator f52965a = new x01();

    /* renamed from: o.x01$a */
    public static final class C18017a implements ObjectEncoder {

        /* renamed from: a */
        public static final C18017a f52966a = new C18017a();

        /* renamed from: b */
        public static final FieldDescriptor f52967b = FieldDescriptor.of(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);

        /* renamed from: c */
        public static final FieldDescriptor f52968c = FieldDescriptor.of("model");

        /* renamed from: d */
        public static final FieldDescriptor f52969d = FieldDescriptor.of("hardware");

        /* renamed from: e */
        public static final FieldDescriptor f52970e = FieldDescriptor.of("device");

        /* renamed from: f */
        public static final FieldDescriptor f52971f = FieldDescriptor.of("product");

        /* renamed from: g */
        public static final FieldDescriptor f52972g = FieldDescriptor.of("osBuild");

        /* renamed from: h */
        public static final FieldDescriptor f52973h = FieldDescriptor.of("manufacturer");

        /* renamed from: i */
        public static final FieldDescriptor f52974i = FieldDescriptor.of("fingerprint");

        /* renamed from: j */
        public static final FieldDescriptor f52975j = FieldDescriptor.of("locale");

        /* renamed from: k */
        public static final FieldDescriptor f52976k = FieldDescriptor.of("country");

        /* renamed from: l */
        public static final FieldDescriptor f52977l = FieldDescriptor.of("mccMnc");

        /* renamed from: m */
        public static final FieldDescriptor f52978m = FieldDescriptor.of("applicationBuild");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(od0 od0Var, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f52967b, od0Var.mo42004m());
            objectEncoderContext.add(f52968c, od0Var.mo42001j());
            objectEncoderContext.add(f52969d, od0Var.mo41997f());
            objectEncoderContext.add(f52970e, od0Var.mo41995d());
            objectEncoderContext.add(f52971f, od0Var.mo42003l());
            objectEncoderContext.add(f52972g, od0Var.mo42002k());
            objectEncoderContext.add(f52973h, od0Var.mo41999h());
            objectEncoderContext.add(f52974i, od0Var.mo41996e());
            objectEncoderContext.add(f52975j, od0Var.mo41998g());
            objectEncoderContext.add(f52976k, od0Var.mo41994c());
            objectEncoderContext.add(f52977l, od0Var.mo42000i());
            objectEncoderContext.add(f52978m, od0Var.mo41993b());
        }
    }

    /* renamed from: o.x01$b */
    public static final class C18018b implements ObjectEncoder {

        /* renamed from: a */
        public static final C18018b f52979a = new C18018b();

        /* renamed from: b */
        public static final FieldDescriptor f52980b = FieldDescriptor.of("logRequest");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(wf1 wf1Var, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f52980b, wf1Var.mo54286c());
        }
    }

    /* renamed from: o.x01$c */
    public static final class C18019c implements ObjectEncoder {

        /* renamed from: a */
        public static final C18019c f52981a = new C18019c();

        /* renamed from: b */
        public static final FieldDescriptor f52982b = FieldDescriptor.of("clientType");

        /* renamed from: c */
        public static final FieldDescriptor f52983c = FieldDescriptor.of("androidClientInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(ab3 ab3Var, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f52982b, ab3Var.mo16808c());
            objectEncoderContext.add(f52983c, ab3Var.mo16807b());
        }
    }

    /* renamed from: o.x01$d */
    public static final class C18020d implements ObjectEncoder {

        /* renamed from: a */
        public static final C18020d f52984a = new C18020d();

        /* renamed from: b */
        public static final FieldDescriptor f52985b = FieldDescriptor.of("eventTimeMs");

        /* renamed from: c */
        public static final FieldDescriptor f52986c = FieldDescriptor.of("eventCode");

        /* renamed from: d */
        public static final FieldDescriptor f52987d = FieldDescriptor.of("eventUptimeMs");

        /* renamed from: e */
        public static final FieldDescriptor f52988e = FieldDescriptor.of("sourceExtension");

        /* renamed from: f */
        public static final FieldDescriptor f52989f = FieldDescriptor.of("sourceExtensionJsonProto3");

        /* renamed from: g */
        public static final FieldDescriptor f52990g = FieldDescriptor.of("timezoneOffsetSeconds");

        /* renamed from: h */
        public static final FieldDescriptor f52991h = FieldDescriptor.of("networkConnectionInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(wia wiaVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f52985b, wiaVar.mo53855c());
            objectEncoderContext.add(f52986c, wiaVar.mo53854b());
            objectEncoderContext.add(f52987d, wiaVar.mo53856d());
            objectEncoderContext.add(f52988e, wiaVar.mo53858f());
            objectEncoderContext.add(f52989f, wiaVar.mo53859g());
            objectEncoderContext.add(f52990g, wiaVar.mo53860h());
            objectEncoderContext.add(f52991h, wiaVar.mo53857e());
        }
    }

    /* renamed from: o.x01$e */
    public static final class C18021e implements ObjectEncoder {

        /* renamed from: a */
        public static final C18021e f52992a = new C18021e();

        /* renamed from: b */
        public static final FieldDescriptor f52993b = FieldDescriptor.of("requestTimeMs");

        /* renamed from: c */
        public static final FieldDescriptor f52994c = FieldDescriptor.of("requestUptimeMs");

        /* renamed from: d */
        public static final FieldDescriptor f52995d = FieldDescriptor.of("clientInfo");

        /* renamed from: e */
        public static final FieldDescriptor f52996e = FieldDescriptor.of("logSource");

        /* renamed from: f */
        public static final FieldDescriptor f52997f = FieldDescriptor.of("logSourceName");

        /* renamed from: g */
        public static final FieldDescriptor f52998g = FieldDescriptor.of("logEvent");

        /* renamed from: h */
        public static final FieldDescriptor f52999h = FieldDescriptor.of("qosTier");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(ija ijaVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f52993b, ijaVar.mo32195g());
            objectEncoderContext.add(f52994c, ijaVar.mo32196h());
            objectEncoderContext.add(f52995d, ijaVar.mo32190b());
            objectEncoderContext.add(f52996e, ijaVar.mo32192d());
            objectEncoderContext.add(f52997f, ijaVar.mo32193e());
            objectEncoderContext.add(f52998g, ijaVar.mo32191c());
            objectEncoderContext.add(f52999h, ijaVar.mo32194f());
        }
    }

    /* renamed from: o.x01$f */
    public static final class C18022f implements ObjectEncoder {

        /* renamed from: a */
        public static final C18022f f53000a = new C18022f();

        /* renamed from: b */
        public static final FieldDescriptor f53001b = FieldDescriptor.of("networkType");

        /* renamed from: c */
        public static final FieldDescriptor f53002c = FieldDescriptor.of("mobileSubtype");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(ltb ltbVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f53001b, ltbVar.mo16420c());
            objectEncoderContext.add(f53002c, ltbVar.mo16419b());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig) {
        C18018b c18018b = C18018b.f52979a;
        encoderConfig.registerEncoder(wf1.class, c18018b);
        encoderConfig.registerEncoder(x31.class, c18018b);
        C18021e c18021e = C18021e.f52992a;
        encoderConfig.registerEncoder(ija.class, c18021e);
        encoderConfig.registerEncoder(x41.class, c18021e);
        C18019c c18019c = C18019c.f52981a;
        encoderConfig.registerEncoder(ab3.class, c18019c);
        encoderConfig.registerEncoder(f41.class, c18019c);
        C18017a c18017a = C18017a.f52966a;
        encoderConfig.registerEncoder(od0.class, c18017a);
        encoderConfig.registerEncoder(s31.class, c18017a);
        C18020d c18020d = C18020d.f52984a;
        encoderConfig.registerEncoder(wia.class, c18020d);
        encoderConfig.registerEncoder(w41.class, c18020d);
        C18022f c18022f = C18022f.f53000a;
        encoderConfig.registerEncoder(ltb.class, c18022f);
        encoderConfig.registerEncoder(a51.class, c18022f);
    }
}
