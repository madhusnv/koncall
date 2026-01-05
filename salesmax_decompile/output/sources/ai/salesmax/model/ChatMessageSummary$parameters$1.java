package ai.salesmax.model;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.ch3;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ChatMessageSummary$parameters$1 extends kf9 implements xk7 {
    public static final ChatMessageSummary$parameters$1 INSTANCE = new ChatMessageSummary$parameters$1();

    /* renamed from: ai.salesmax.model.ChatMessageSummary$parameters$1$1 */
    public static final class C01011 extends kf9 implements xk7 {
        public static final C01011 INSTANCE = new C01011();

        public C01011() {
            super(1);
        }

        @Override // p001o.xk7
        public final Parameter invoke(com.amplifyframework.datastore.generated.model.Parameter parameter) {
            return new Parameter(parameter.getType(), parameter.getValue(), parameter.getParameterName());
        }
    }

    public ChatMessageSummary$parameters$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Parameter invoke$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Parameter) xk7Var.invoke(obj);
    }

    @Override // p001o.xk7
    public final TemplateParameter invoke(com.amplifyframework.datastore.generated.model.TemplateParameter templateParameter) {
        String taType = templateParameter.getTaType();
        List<com.amplifyframework.datastore.generated.model.Parameter> parameters = templateParameter.getParameters();
        if (parameters == null) {
            parameters = ch3.m21246k();
        }
        Stream<com.amplifyframework.datastore.generated.model.Parameter> stream = parameters.stream();
        final C01011 c01011 = C01011.INSTANCE;
        Object objCollect = stream.map(new Function() { // from class: ai.salesmax.model.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary$parameters$1.invoke$lambda$0(c01011, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return new TemplateParameter(taType, (List) objCollect);
    }
}
