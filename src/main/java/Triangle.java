public class Triangle {

  private Integer mSideOne;
  private Integer mSideTwo;
  private Integer mSideThree;

  public Triangle(int sideOne, int sideTwo, int sideThree) {
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;
  }

  public int getSideOne() {
    return mSideOne;
  }

  public int getSideTwo() {
    return mSideTwo;
  }

  public int getSideThree() {
    return mSideThree;
  }

  public boolean isEquilateral() {
    return mSideOne == mSideTwo && mSideOne == mSideThree;
  }

  public boolean isIsosceles() {
    return !isNotTriangle() &&  !isEquilateral() && (mSideOne == mSideTwo || mSideTwo == mSideThree || mSideThree == mSideOne);
  }

  public boolean isScalene() {
    return !isNotTriangle() && (mSideOne != mSideTwo && mSideTwo != mSideThree);
  }

  public boolean isNotTriangle() {
    return (mSideOne + mSideTwo < mSideThree) || (mSideTwo + mSideThree < mSideOne) || (mSideThree + mSideOne < mSideTwo);
  }
}
