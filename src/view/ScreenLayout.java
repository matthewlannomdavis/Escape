package view;
import model.Player;

public class ScreenLayout {
	private StatsPanel statsPanel = new StatsPanel();
	private ButtonPanel buttonPanel = new ButtonPanel();
	private BagPanel bagPanel = new BagPanel();
	private ProgressPanel progressPanel = new ProgressPanel();
	private DescriptionPanel descriptionPanel = new DescriptionPanel();
	
	public void Update(Player aPlayer) {
		statsPanel.Update(aPlayer);
		buttonPanel.Update(aPlayer);
		bagPanel.Update(aPlayer);
		progressPanel.Update(aPlayer);
		descriptionPanel.Update(aPlayer);
	}
}
