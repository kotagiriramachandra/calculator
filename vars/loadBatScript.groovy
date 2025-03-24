def call(Map config = [:]) {
  def scriptcontents = libraryResource "scripts/windows/${config.name}"
  witeFile file: "${config.name}", text: scriptcontents
  bat "./${config.name}"
}
