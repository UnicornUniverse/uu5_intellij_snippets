package com.unicorn.uu5_intellij_snippets;

import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

public class Uu5TemplateProvider extends TemplateContextType {
    protected Uu5TemplateProvider() {
        super("UU5", "Uu5");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        String name = templateActionContext.getFile().getName();
        return name.endsWith(".js") || name.endsWith(".ts");
    }
}
