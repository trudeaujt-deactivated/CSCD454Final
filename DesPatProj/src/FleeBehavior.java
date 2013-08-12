
public interface FleeBehavior 
{
	public void flee();
	FleeBehavior[] fleeBehavior = {new FleeTurnTail(), new FleeBackOutFighting()};
}
