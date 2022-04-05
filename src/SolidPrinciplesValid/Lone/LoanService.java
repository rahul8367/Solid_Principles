package SolidPrinciplesValid.Lone;
/*dependency inversion principle it states that
the high level modules should not depend on low level modules directly
it must use abstraction in between them to loosly coupling.
 */
public interface LonePlan {
    public void plans(int amount);
}
