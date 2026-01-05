package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.TemplateParameter;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ChatMessageSummary$parameters$templateParameters$1 extends kf9 implements xk7 {
    public static final ChatMessageSummary$parameters$templateParameters$1 INSTANCE = new ChatMessageSummary$parameters$templateParameters$1();

    /* renamed from: ai.salesmax.model.ChatMessageSummary$parameters$templateParameters$1$1 */
    public static final class C01021 extends kf9 implements xk7 {
        public static final C01021 INSTANCE = new C01021();

        public C01021() {
            super(1);
        }

        @Override // p001o.xk7
        public final com.amplifyframework.datastore.generated.model.Parameter invoke(Parameter parameter) {
            return com.amplifyframework.datastore.generated.model.Parameter.builder().type(parameter.getType()).value(parameter.getValue()).parameterName(parameter.getParameter_name()).build();
        }
    }

    public ChatMessageSummary$parameters$templateParameters$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.amplifyframework.datastore.generated.model.Parameter invoke$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (com.amplifyframework.datastore.generated.model.Parameter) xk7Var.invoke(obj);
    }

    @Override // p001o.xk7
    public final com.amplifyframework.datastore.generated.model.TemplateParameter invoke(TemplateParameter templateParameter) {
        TemplateParameter.BuildStep buildStepBuilder = com.amplifyframework.datastore.generated.model.TemplateParameter.builder();
        Stream<Parameter> stream = templateParameter.getParameters().stream();
        final C01021 c01021 = C01021.INSTANCE;
        return buildStepBuilder.parameters((List) stream.map(new Function() { // from class: ai.salesmax.model.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ChatMessageSummary$parameters$templateParameters$1.invoke$lambda$0(c01021, obj);
            }
        }).collect(Collectors.toList())).taType(templateParameter.getTaType()).build();
    }
}
