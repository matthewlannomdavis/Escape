package view;
import model.Player;

public class ScreenLayout {
	private StatsPanel statsPanel = new StatsPanel();
	private ButtonPanel buttonPanel = new ButtonPanel();
	private BagPanel bagPanel = new BagPanel();
	private ProgressPanel progressPanel = new ProgressPanel();
	private DescriptionPanel descriptionPanel = new DescriptionPanel();
	
	public void Update(Player aPlayer) {
		statsPanel.update(aPlayer);
		buttonPanel.update(aPlayer);
		bagPanel.update(aPlayer);
		progressPanel.update(aPlayer);
		descriptionPanel.update(aPlayer);
	}
}
