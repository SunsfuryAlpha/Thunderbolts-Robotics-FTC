package robot;


public class RobotBase
{

	private DriveBase driveBase;

	public RobotBase(DriveBase drive)
	{

		driveBase = drive;

	}


	public DriveBase getDriveBase()
	{
		return driveBase;
	}

	public void setDriveBase(DriveBase drive)
	{
		driveBase = drive;
	}
}
