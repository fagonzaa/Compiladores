.class public Program
.super java/lang/Object

.field private b I
.field private prueba LProgram

.method public Programa(I)I
    .limit locals 100
    .limit stack 100
    **** CONDITION ***
    ldc 1
    istore 2
    ldc 2
    istore 3
    iload 2
    iload 3
    if_icmpgt IF_Programa_3
    goto END_IF_Programa_1
    IF_Programa_3:
    ldc 3
    istore 4
    ldc 4
    istore 5
    iload 4
    iload 5
    if_icmpgt IF_Programa_4
    goto END_IF_Programa_1
    IF_Programa_4:
    **** END CONDITION ***
    IF_Programa_0:
    iload 1
    istore 6
    iinc 1 1
    iload 6
    END_IF_Programa_2:
    IF_Programa_1:
    END_IF_Programa_2:
.end method

.method public Programa2(II)I
    .limit locals 100
    .limit stack 100
    ldc 1
    istore 4
    ldc 2.5
    fstore 5
    iload 4
    fload 5
    fadd
    iload 3
.end method
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method
